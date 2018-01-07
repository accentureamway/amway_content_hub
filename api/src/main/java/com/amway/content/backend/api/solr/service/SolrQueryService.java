package com.amway.content.backend.api.solr.service;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.amway.content.backend.api.dto.IDTO;
import com.amway.content.backend.api.dto.SolrDTO;
import com.amway.content.backend.api.model.SolrCommonModel;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

@Component
public class SolrQueryService {

	@Autowired
	private SolrClient solrClient;
	public Object queryUsingEdismax(SolrCommonModel model) throws SolrServerException, IOException {
		SolrQuery query=parseQuery(model);
		query.setRequestHandler("/edismaxQ");
		 QueryResponse resp =solrClient.query(model.getCoreName(), query);
		 return resp.toString();
	}
	private IDTO toJson(QueryResponse resp) {
		Gson gson=new Gson();
		return gson.fromJson(resp.toString(), SolrDTO.class);
	}
	private SolrQuery parseQuery(SolrCommonModel model) {
		
		SolrQuery query=new SolrQuery();
		if(StringUtils.isNotBlank(model.getQ())) {
			query.setQuery(model.getQ());
		}
		if(StringUtils.isNotBlank(model.getQf())) {
			query.setFields(model.getQf());
		}
		query.set("wt","json");
		query.set("indent", true);
		return query;
	}
}

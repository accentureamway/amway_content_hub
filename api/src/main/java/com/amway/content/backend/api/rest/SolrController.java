package com.amway.content.backend.api.rest;

import java.io.IOException;

import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.amway.content.backend.api.model.SolrCommonModel;
import com.amway.content.backend.api.solr.service.SolrQueryService;

@RestController
@RequestMapping(value="/api/solr")
public class SolrController extends BaseController{
	
	@Autowired
	private SolrQueryService solrQuerService;
	@GetMapping(value="/edismaxQ")
	public @ResponseBody Object edismaxQ(@ModelAttribute SolrCommonModel model) throws SolrServerException, IOException {
		
		return solrQuerService.queryUsingEdismax(model);
	}
}


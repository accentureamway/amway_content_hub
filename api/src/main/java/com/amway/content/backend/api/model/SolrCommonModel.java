package com.amway.content.backend.api.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SolrCommonModel implements IModel{
	/** Solr lowercaseOperators */
	private String lowercaseOperators;
	
	/** Solr stopwords */
	private String stopwords;
	
	/** Solr query fields */
	private String qf;
	
	/** Solr query parser */
	private String defType;
	
	/** Solr boost query */
	private String bq;
	
	/** Solr URL prefix */
	private String urlPrefix;
	
	/** Solr core name */
	private String coreName;
	
	/** Solr query string */
	private String q = "*:*";
	
	/** Defines the fields to return for each document */
	private String fl;
	
	/** Specifies an offset (by default: 0) */
	private Integer start;
	
	/** Rows of responses are displayed at a time (default value: 10) */
	private Integer rows;
	
	/** Sort field, it works with sortString field */
	private String sortField;
	
	/** Sort string, it works with sortField, e.g. SolrQuery.ORDER.asc,SolrQuery.ORDER.desc */
	private String orderString;
	
}
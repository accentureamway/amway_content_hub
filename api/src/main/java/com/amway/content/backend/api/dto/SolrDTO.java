package com.amway.content.backend.api.dto;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class SolrDTO implements IDTO{
	public Map<String,Object> responseHeader;
	public Map<String, Object> response;
	public Map<String, Object> highlighting;
}

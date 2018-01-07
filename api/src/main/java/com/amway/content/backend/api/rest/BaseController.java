package com.amway.content.backend.api.rest;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class BaseController {

	@ExceptionHandler(Exception.class)	
	public Object hanldeException(Exception exception) {
		exception.printStackTrace();
		return null;
	}
}

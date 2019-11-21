package com.chenwoon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringCtrl {

	private final Logger logger = LoggerFactory.getLogger(SpringCtrl.class);
	
	@RequestMapping(value = "/hello")
	public String hello() {
		logger.info("logger hello!");
		return "Hello World!!";
	}
}

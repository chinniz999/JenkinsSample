package com.sample.selenium.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class SampleLog4j {
	
	public static Logger logger = Logger.getLogger(SampleLog4j.class);public SampleLog4j() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void HelloWorldLog4j()
	{
		logger.info("Welcome to Log4j world!");
		logger.debug("Log4j Hello World Debug message");
		logger.error("Log4j Hello World Error message");
		logger.fatal("Log4j hellow world Fatal Meesage");
	}

	
}

package com.sample.selenium.test;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleClassTest {
	
	public static Logger logger = Logger.getLogger(SampleClassTest.class);

	// testng - Testing Framework
	// Annotation
	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		logger.info("--------------" + "Before Method");
		driver.get("http://www.google.com");
	}

	@AfterMethod
	public void AfterMethod() {
		logger.info("--------------" + "@AfterMethod");
		driver.quit();
	}

	@Test
	public void test1() {
		logger.info("testing-01" + driver.getTitle());
	}

	@Test
	public void test2(ITestContext description) {
		logger.info("testing-02" + driver.getTitle());
		description.getAttribute("AA");
		
	}

	@Test(description = "Verify Page title")
	public void test3() {
		logger.info("testing-03" + driver.getTitle());
	}

}

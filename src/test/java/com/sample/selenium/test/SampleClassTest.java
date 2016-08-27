package com.sample.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleClassTest {

	// testng - Testing Framework
	// Annotation
	WebDriver driver = null;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		System.out.println("--------------" + "Before Method");
		driver.get("http://www.google.com");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("--------------" + "@AfterMethod");
		driver.quit();
	}

	@Test
	public void test1() {
		System.out.println("testing-01" + driver.getTitle());
	}

	@Test
	public void test2(ITestContext description) {
		System.out.println("testing-02" + driver.getTitle());
		description.getAttribute("AA");
		
	}

	@Test(description = "Verify Page title")
	public void test3() {
		System.out.println("testing-03" + driver.getTitle());
	}

}

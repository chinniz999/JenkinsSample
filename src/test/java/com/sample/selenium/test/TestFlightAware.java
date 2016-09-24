package com.sample.selenium.test;

import org.testng.annotations.Test;

import com.sample.selenium.pages.IrctcLoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class TestFlightAware {
WebDriver driver = new FirefoxDriver();
	
	@Test(priority = 0)
  public void f() {
		
		WebElement cssValue= driver.findElement(By.xpath("//header[@id='topWrapper']//option[@value='en_US']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('s').value='Flight aware	sending'");
	  
  }

	@BeforeTest
	public void beforeTest() {
		driver.get("https://uk.flightaware.com/live/");
	}

	@AfterTest
	public void afterTest() {
	
	}

}

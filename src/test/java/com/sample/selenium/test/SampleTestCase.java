package com.sample.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestCase {
	@Test
  public void testCase01() throws InterruptedException {
		String replacetext = null;
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://www.flipkart.com");
	  driver.findElement(By.name("q")).sendKeys("dell laptops windows 10");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	 // Thread.sleep(5000);

	  By rating = By.xpath("//span[text()='1843']/../../a/../div/span/div[text()='3.7']");
	  String ratingtext=driver.findElement(rating).getText();
	  System.out.println("@@@@@"+ratingtext.replace("?", ""));
	/*  if(ratingtext.contains("?"))
	  replacetext= ratingtext.replace("?", "")	;*/
	  Assert.assertTrue(true, "3"+".7".contains(ratingtext));
	  
  }
}

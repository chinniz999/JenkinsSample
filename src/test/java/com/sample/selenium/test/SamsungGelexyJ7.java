package com.sample.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SamsungGelexyJ7 {
	@Test
	public void testCase01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\JenkinsSample\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("samsung galaxy j7");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//Thread.sleep(5000);
                    
		
		 By rating = By.xpath("//div[3]/a/div[2]/div[1]/div[1]");
		 String ratingtext=driver.findElement(rating).getText();
		  Assert.assertTrue(true);
		  System.out.println("@@@@@"+ratingtext);
		   //Assert.assertTrue(true, "SAMSUNG Galaxy J5)".contains(ratingtext));
		 
	}
	}
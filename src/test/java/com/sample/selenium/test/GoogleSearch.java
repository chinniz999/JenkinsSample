package com.sample.selenium.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleSearch {
	WebDriver driver = new FirefoxDriver();

	@Test
	public void SearchText() {
		WebElement searchBox = driver.findElement(By.xpath("//input[@id='gs_htif0']"));
		searchBox.sendKeys("Seleniumhq");
		driver.findElement(By.xpath("//button[@name='btnG']")).click();
		
		Assert.assertTrue(searchBox.getAttribute("Value").equalsIgnoreCase("Seleniumhq"));
	}

	@BeforeTest
	public void GooglesiteOpen() {
		driver.get("http://www.google.com");
	}

	@AfterTest
	public void GooglesiteClose() {
		driver.close();
	}

}

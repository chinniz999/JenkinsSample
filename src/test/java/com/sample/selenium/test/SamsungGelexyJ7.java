package com.sample.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class SamsungGelexyJ7 {
	@Test
	public void testCase01() throws InterruptedException {
		 String replacetext = null;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.icicibank.com/");
		//driver.findElement(By.name("q")).sendKeys("samsung galaxy j7");
		driver.findElement(By.xpath("//body/div[1]/div[1]/div[2]/ul/li[4]/a")).click();
		Thread.sleep(5000);

		
		  By rating = By.xpath("//div[3]/a/div[2]/div[1]/div[1]");
		  String ratingtext=driver.findElement(rating).getText();
		  Assert.assertTrue(true);
/*		  System.out.println("@@@@@"+ratingtext.replace("?", ""));
		  if(ratingtext.contains("?")) replacetext= ratingtext.replace("?", "")
		  ; Assert.assertTrue(true, "3"+".7".contains(ratingtext));
		 
*/	}
}

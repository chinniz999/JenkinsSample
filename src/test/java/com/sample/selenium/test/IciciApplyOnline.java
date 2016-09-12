package com.sample.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class IciciApplyOnline {
  @Test
  public void HomePageApplyOnline() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://www.icicibank.com/");
	  String xPath = "//a[@rel='ct_ctnr' AND text()='Apply Online']";
  }
}

package com.sample.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IrctcUserHomePage {

	WebDriver driver;
	By homePageUserName = By.xpath("//b[contains(text(),'srinivas  Bikkina')]");

	/*
	 * public IrctcUserHomePage(WebDriver driver){ this.driver = driver; }
	 */
	/*
	 * //get the title from Login page public String getLoginTitle(){ return
	 * driver.findElement(title_text).getText(); }
	 */

	// get the user name from homepage
	public String getUserHomepageUserName() {
		return driver.findElement(homePageUserName).getText();
	}
}

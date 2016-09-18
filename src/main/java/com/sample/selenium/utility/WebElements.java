package com.sample.selenium.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class WebElements {
	WebDriver driver;

	public WebElements(WebDriver driver) {
		this.driver = driver;
	}

	public void enterText(By locator,String sdata) {
	
		driver.findElement(locator).sendKeys(sdata);

	}

	public void click() {

	}

}

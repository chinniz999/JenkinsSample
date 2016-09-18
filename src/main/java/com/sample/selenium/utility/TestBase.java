package com.sample.selenium.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sample.selenium.constants.Setup;

public class TestBase implements Setup {

	private static final String CHROMEPATH = null;

	public WebDriver initalizeBrowser(String sbrowser) {
		WebDriver driver = null;
		if (sbrowser.equalsIgnoreCase("FF")) {

		} else if (sbrowser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", CHROMEPATH);
			driver = new ChromeDriver();
		}
		return driver;
	}

	public void naviagte(String surl, WebDriver driver) {
		driver.get(surl);
	}

	{

	}

}

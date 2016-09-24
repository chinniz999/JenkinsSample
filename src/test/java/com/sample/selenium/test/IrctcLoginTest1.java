package com.sample.selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sample.selenium.pages.IrctcLoginPage;
import com.sample.selenium.pages.IrctcUserHomePage;
import com.sample.selenium.utility.TestBase;

public class IrctcLoginTest1 extends TestBase {
	
	// WebDriver driver = new FirefoxDriver();
	WebDriver driver;
	private IrctcLoginPage objIrctcLogin;
	private IrctcUserHomePage objIrctcUserHomePage;

	@Test(priority = 0)
	public void TestIrctcLogin() throws InterruptedException {

		
		// Login to irctic application
		/*String uname = "bsmanjali";
		String password = "bje703";*/
		
		Thread.sleep(2000);
		objIrctcLogin.login_Irctc("bsmanjali", "bje703");
		
		// go to the user home page
		String text = objIrctcUserHomePage.getUserHomepageUserName();
		System.out.println("Irctc User: "+text);
		
		// verify user home page
		// Assert.assertTrue(text.getUserHomepageUserName().toLowerCase().contains(loginPageTitle));
	}

	@Test
	public void toolTip()
	{
		driver.findElement(By.id("originName")).getAttribute("value");
		List<WebElement> a=driver.findElements(By.id("originName"));
		a.size();
		String a1="testing";
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("document.getElementById("+a1+")"+".value="+"");
		
		
	}
	
	@BeforeTest
	public void beforeTest() {
		driver=initalizeBrowser(SBROWSER);
		naviagte(IRCTCURL, driver);
		objIrctcLogin= new IrctcLoginPage(driver);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

package com.sample.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.testng.annotations.Test;

import com.sample.selenium.utility.WebElements;

public class IrctcLoginPage extends WebElements{
	WebDriver driver;

	By irctcUserName = By.name("id");
	By irctcPassword = By.name("Password");
	By irctcCaptcha = By.name("j_captcha");
	By login = By.name("Jbotton");
	//By title_text = By.xpath("//span[@style='white-space:pre;']");
	String irctcCaptchaText;
	
	/*By irctcCaptcha = By.xpath("//input[@name='j_captcha']");
	By irctcUserName = By.xpath("//input[@id='Email']");
	By title_text = By.xpath("//input[@id='next']");
	By irctcPassword = By.xpath("//input[@id='Passwd']");
	By login = By.xpath("//input[@id='signIn']");*/
	
	public IrctcLoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	//set user name in text box
	public void setUserName(String strUserName){
		//driver.findElement(irctcUserName).sendKeys(strUserName);
		enterText(irctcUserName, strUserName);
		//	driver.findElement(By.xpath("//input[@id='usernameId']"));
		//driver.findElement(By.id("id"));
	}
	
	//set password in Password textbox
	public void setPassword(String strPassword){
		
		driver.findElement(irctcPassword).sendKeys(strPassword);
	}
	
	//set captcha in captcha text box
	public void setCaptcha(){
		String irctcCaptchaText = driver.findElement(By.xpath("//input[@name='j_captcha']")).getText();
		driver.findElement(irctcCaptcha).sendKeys(irctcCaptchaText);
	}
	
	//Click on Login button
	public void clickLogin(){
		driver.findElement(login).click();
	}
		
	public void login_Irctc(String strUserName, String strPassword){
		this.setUserName(strUserName);
		this.setPassword(strPassword);
		this.setCaptcha();
		this.clickLogin();
	}
}

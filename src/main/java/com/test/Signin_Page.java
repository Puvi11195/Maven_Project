package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {
	private WebDriver driver;
	@FindBy(xpath = "//a[@class='login']")
	private  WebElement signin;
	

	public  WebElement getSignin() {
		return signin;
	}
	public Signin_Page(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver,this );
	}

}

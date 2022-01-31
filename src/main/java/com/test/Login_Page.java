package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	
	private WebDriver driver;
	@FindBy(id="email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}
	public Login_Page( WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="passwd")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="SubmitLogin")
	private WebElement submitLogin;

	public WebElement getSubmitLogin() {
		return submitLogin;
	}

}

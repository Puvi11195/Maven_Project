package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage6 {
	
	
	@FindBy(name="processAddress")
	private WebElement Address;
	private WebDriver driver;

	public WebElement getAddress() {
		return Address;
	}
	public AddressPage6(WebDriver driver) {
   this.driver=driver;
   PageFactory.initElements(driver, this);
	}
	

}

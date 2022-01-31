package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage3 {
	
	@FindBy(name="Submit")
	private WebElement addToCart;
	private WebDriver driver;
	public WebElement getAddToCart() {
		return addToCart;
	}
	public AddtoCartPage3(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this );
	}
	

	
}

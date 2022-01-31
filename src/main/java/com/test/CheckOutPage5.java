package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage5 {
	
	@FindBy(xpath="//a[@title='Proceed to checkout'])[2]")
	private WebElement element;
	private WebDriver driver;

	public WebElement getElement() {
		return element;
	}
	public CheckOutPage5(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	

}

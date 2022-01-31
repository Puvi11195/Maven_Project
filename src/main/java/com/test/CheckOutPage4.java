package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage4 {
	@FindBy(xpath="//a[@title='Proceed to checkout']")
	private WebElement checkOut;
	private WebDriver driver;

	public  WebElement getCheckOut() {
		return checkOut;
	}
public CheckOutPage4(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	
	

}

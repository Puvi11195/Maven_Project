package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sleeve_TshirtPage2 {

	private WebDriver driver;
	@FindBy(xpath="//img[contains(@alt,'Short Sleeve ')]")
	private WebElement sleeveTshirt;

	public WebElement getSleeveTshirt() {
		return sleeveTshirt;
	}
	public Sleeve_TshirtPage2(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
	}
	
}

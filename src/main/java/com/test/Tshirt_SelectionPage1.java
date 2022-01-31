package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_SelectionPage1 {
	private WebDriver driver;
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tShirt;
	

	public WebElement gettShirt() {
		return tShirt;
	}
	public Tshirt_SelectionPage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}

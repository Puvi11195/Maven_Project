package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelivaryPage7 {

	@FindBy(id="cgv")
	private WebElement conditionClick;
	private WebDriver driver;

	public WebElement getConditionClick() {
		return conditionClick;
	}
	public DelivaryPage7(WebDriver driver) {

		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="processCarrier")
	private WebElement processCarrier;

	public WebElement getProcessCarrier() {
		return processCarrier;
	}
	





}

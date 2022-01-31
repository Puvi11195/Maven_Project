package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	

	public static WebDriver driver;

	public static  void clickMethod(WebElement element) {
		element.click();

	}
	public static void sendValues(WebElement element,String Value) {
		element.sendKeys(Value);

	}

	public static void getUrl(String url) {

		driver.get(url);
	}
	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
			
			 driver = new ChromeDriver();
			
		}
		return driver;
		
	}
}

package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver getBrowser(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") +"\\Driver\\geckodriver.exe");

			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void ClickOnElement(WebElement element) {
		element.click();

	}
	public static void inputValueElement(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void close() {
		driver.close();

	}
	public static void implicitWait(int seconds,TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(seconds, format);
		
	}
	public static void sleep(int  seconds) throws Throwable {
		Thread.sleep(seconds);
		
	}
	public static void explicitWait(int seconds,WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	public static void scrollUpAndDown(WebElement element) {
		try {
			JavascriptExecutor js =(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView;", element);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		}
	public static void dropDown(String type,WebElement element,String data) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byIndex")) {
			int value = Integer.parseInt(data);
			s.selectByIndex(value);
			
		}else if (type.equalsIgnoreCase("byValue")) {
			s.selectByValue(data);
			
		}else if (type.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(data);
			
		}
		
		

	}
}


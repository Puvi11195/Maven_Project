package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RunnerClass extends BaseClass{
	
	public static WebDriver driver;

	public static void main(String[] args) {

		driver=getBrowser("chrome");
		getUrl("https://adactinhotelapp.com/");
		driver.get("https://adactinhotelapp.com/");	
		
		WebElement userName = driver.findElement(By.id("username"));
        inputValueElement(userName,"PoongundranM" );
		
		WebElement password = driver.findElement(By.id("password"));
        inputValueElement(password, "Adactin@11195");
		
		WebElement login = driver.findElement(By.id("login"));
        ClickOnElement(login);
		close();
	}

}

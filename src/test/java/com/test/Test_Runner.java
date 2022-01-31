package com.test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test_Runner extends Base_Class{
	public static WebDriver driver;
	public static Signin_Page sp = new Signin_Page(driver);
	public static Login_Page lp = new Login_Page(driver);
	public static Tshirt_SelectionPage1 t1 = new Tshirt_SelectionPage1(driver);
	public static Sleeve_TshirtPage2 t2 = new Sleeve_TshirtPage2(driver);
	public static AddtoCartPage3 t3 = new AddtoCartPage3(driver);
	public static CheckOutPage4 t4 = new CheckOutPage4(driver);
	public static CheckOutPage5 t5 = new CheckOutPage5(driver);
	public static AddressPage6 t6 = new AddressPage6(driver);
	public static DelivaryPage7 t7=new DelivaryPage7(driver);

	public static void main(String[] args) throws Throwable   {

		driver = browserLaunch("chrome");
		getUrl("http://automationpractice.com/index.php");
		clickMethod(sp.getSignin());
		sendValues(lp.getEmail(), "poongu11195@hotmail.com");
		sendValues(lp.getPassword(),"987654321");
		clickMethod(lp.getSubmitLogin());
		clickMethod(t1.gettShirt());
		clickMethod(t2.getSleeveTshirt());
		clickMethod(t3.getAddToCart());
		clickMethod(t4.getCheckOut());
		clickMethod(t5.getElement());
		clickMethod(t6.getAddress());
		clickMethod(t7.getConditionClick());
		clickMethod(t7.getProcessCarrier());
		driver.close();





	}
}

package com.eBS.testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest
{
	
	public static WebDriver driver;

	public void intializationDriver(String strUrl)
	{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
	driver = new ChromeDriver();
	this.setDriver(driver);
	driver.get(strUrl);
	driver.manage().window().maximize();
	
	}
	public void tearDown() {
	driver.quit();
	}
	public WebDriver getDriver() {
	return driver;
	}
	public void setDriver(WebDriver driver) {
	BaseTest.driver = driver;
	}
	
	public void waitFor(int timeUnitinsecond)
	{
		try {
			Thread.sleep(TimeUnit.MILLISECONDS.convert(timeUnitinsecond,TimeUnit.SECONDS));
			
		} catch (Exception exception) {
			System.out.println("Error Message " +exception.getMessage());
		}
		
	}
	
	public String strCurrentURL()
	{
		String strURL = driver.getCurrentUrl();
		return strURL;
	}

}

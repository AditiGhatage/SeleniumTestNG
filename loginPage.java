package com.eBS.PageFactory;

import org.openqa.selenium.By;

import com.eBS.testNG.BaseTest;


public class loginPage extends BaseTest
{
		By inpUserName=By.xpath("//input[@id='UserName']");
		By inpPassword=By.xpath("//input[@id='Password']");
		By btnGetStarted=By.xpath("//button[text()='Get Started']");

		public void setUserName(String strUsername) 
		{
			driver.findElement(inpUserName).sendKeys(strUsername);
		}

		public void setPassword(String setPassword) 
		{
			driver.findElement(inpPassword).sendKeys(setPassword);
		}

		public void clickGetStarted() 
		{
			driver.findElement(btnGetStarted).click();
		}

}

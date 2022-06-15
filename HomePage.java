package com.eBS.PageFactory;

import org.openqa.selenium.By;

import com.eBS.testNG.BaseTest;

public class HomePage extends BaseTest
{
	By txt = By.xpath("//div[@class='pull-left d-flex align-items-center']");
	By txtNotification = By.xpath("//div[@id=\"NotificationStatusbtn\"]/i");
	By txtPortfolio = By.xpath("//div[text()='Portfolio Products']");
	By txtPremera = By.linkText("Premera");
	By txtACSPDental = By.xpath("//div[text() = 'AC SP Dental']");
	By txtACDental = By.xpath("//div[text() = 'AC Dental Foundation']");
	
	
	public void getnotifications()
	{
		waitFor(10);
		driver.findElement(txtNotification).click();
		
		//driver.close();
		System.out.println("Notifications.");
	}
	public void getPortfolioProducts()
	{
		driver.findElement(txtPortfolio).click();
		//waitFor(2);
		System.out.println("Portfolio page is opened");
		
	}
	
	public void clickTextPremera() {
		driver.findElement(txtPremera).click();
		System.out.println("TextPremera Button Clicked");
		}


		public void clickACSPDental() {
		driver.findElement(txtACSPDental).click();
		System.out.println("ACSP Dental Button Clicked");
		}

		public void clickACDental() {
		driver.findElement(txtACDental).click();
		System.out.println("ACDental Button Clicked");
		}

}

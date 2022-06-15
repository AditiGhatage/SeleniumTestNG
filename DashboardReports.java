package com.eBS.PageFactory;

import org.openqa.selenium.By;

import com.eBS.testNG.BaseTest;

public class DashboardReports extends BaseTest
{
	By menuDashboard = By.xpath("//a[@id = 'executivedashBoard']");
	By btndownload = By.xpath("//a[@id=\"btnChartgridExportToExcel\']");
	
	
	public void getDashboardReports()
	{
		driver.findElement(menuDashboard).click();
	}
	
	public void getDownload() 
	{
		driver.findElement(btndownload).click();
		System.out.println("Downloaded");
	}

}

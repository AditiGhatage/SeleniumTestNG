package com.eBS.PageFactory;

import org.openqa.selenium.By;

import com.eBS.testNG.BaseTest;

public class PortfolioPage extends BaseTest
{
	By txtProductBuild =  By.xpath("//li[@class='active ui-state-default ui-corner-top ui-tabs-active ui-state-active']");
	By txtPackageBuild = By.xpath("//a[text()='Package Build']");
	//*[@id="portfolioTab"]/div[1]/ul/li[2]
	By txtAddPortfolio = By.xpath("//button[@class=\"btn-fill-blue pull-right ml10 btn-add-portfolio\"]");
	By drpdwnSwitchView = By.xpath("(//select[@id='drpViewModeLoad'])[1]");
	By btnproductSearch = By.xpath("//button[@id='switchToadvanceSearch']");
	By btnAddPortfolio = By.xpath("//button[@class='btn-fill-blue pull-right ml10 btn-add-portfolio']");
	By txtRefresh = By.xpath("//span[@id='refresh_pdg']");
	By txtbulkWorkflowUpdate = By.xpath("//span[@id=\"btnPortfolioBulkWorkflowUpdate\']");
	
	public void getPortfolioPage()
	{
		driver.findElement(By.xpath("//*[@id=\"PortfolioSearch\"]")).click();
	}
	
	public void verifyproductBuild() 
	{
		driver.findElement(txtProductBuild).click();
		waitFor(10);
		System.out.println("Product Build is Selected");
	}


	public void verifypackageBuild() 
	{
	driver.findElement(txtPackageBuild).click();
	waitFor(10);
	System.out.println("Package Build Selected");
	}
	
	public void verifyswitchView() 
	{
		driver.findElement(drpdwnSwitchView).click();
	}
	public void clickProductView() 
	{
		driver.findElement(btnproductSearch).click();
	}

	public void getProductname() 
	{
		driver.findElement(btnAddPortfolio).click();
	}

	public void getrefreshButton() 
	{
		driver.findElement(txtRefresh).click();

	}

	public void bulkWorkflowButton() 
	{
		driver.findElement(txtbulkWorkflowUpdate).click();
	}

}

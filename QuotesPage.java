package com.eBS.PageFactory;

import org.openqa.selenium.By;

import com.eBS.testNG.BaseTest;

public class QuotesPage extends BaseTest
{
	By loc_mnuquotes = By.xpath("//i[@class=\"icons-Quote mr10\']");
	By loc_fltrselectAll = By.xpath("//select[@id=\"drpsearchTypeFilter\']");
	By loc_txtSearch = By.xpath("//input[@id=\"searchDoc\']");


	public void getQuotesIcon() {
	driver.findElement(loc_mnuquotes).click();
	System.out.println("Click on Quotes Icon");
	}


	public void getAllFilters() {
	driver.findElement(loc_fltrselectAll).click();
	System.out.println("Click to Select Filter");
	}


	public void getSearchResults() {
	driver.findElement(loc_txtSearch).click();
	System.out.println("Click to Search Results");
	}




}

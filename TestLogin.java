package com.eBS.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.eBS.PageFactory.DashboardReports;
import com.eBS.PageFactory.DesignPage;
import com.eBS.PageFactory.HomePage;
import com.eBS.PageFactory.PortfolioPage;
import com.eBS.PageFactory.QuotesPage;
import com.eBS.PageFactory.loginPage;
import com.eBS.testNG.BaseTest;

public class TestLogin extends BaseTest {

	public loginPage objLoginPage;
	private HomePage objHomePage;
	private PortfolioPage objPortfolioPage;
	private DashboardReports objDashboardReports;
	private QuotesPage objquotes;
	private DesignPage objDesignPage;;


	public void initializeWebPage() {
		objLoginPage = new loginPage();
		objHomePage = new HomePage();
		objPortfolioPage = new PortfolioPage();
		objDashboardReports = new DashboardReports();
		objquotes = new QuotesPage();
		objDesignPage = new DesignPage();
	}

	@BeforeClass
	public void initializeWebEnv() {
		this.initializeWebPage();
		objLoginPage.intializationDriver("https://ebs4-qa2.simplifyhealthcare.com/");
	}

	@AfterClass
	public void tearDown() {
		objLoginPage.tearDown();
	}
	

	@Test
	public void TC_1001_verifyLoginFunction() {
		objLoginPage.setUserName("v-khushbut");
		objLoginPage.setPassword("Summer@2018#");
		objLoginPage.clickGetStarted();
		
		waitFor(3);
	}
	
/*	 @Test 
	 public void TC_1003_verifyhomePage() 
	 {
		 objHomePage.getPortfolioProducts(); 
		 
	 } */
	 

	@Test
	public void TC_1002_verifyPortfolioPage() {
		//objPortfolioPage.intializationDriver("https://ebs4-qa2.simplifyhealthcare.com/ConsumerAccount/PortfolioSearch");
		objPortfolioPage.getPortfolioPage(); // objPortfolioPage.productBuild();

		String strExpectedUrl = "https://ebs4-qa2.simplifyhealthcare.com/ConsumerAccount/PortfolioSearch";
		String strActualUrl = objHomePage.strCurrentURL();
		Assert.assertEquals(strActualUrl, strExpectedUrl);
	}

	@Test
	public void TC_1004_verifyDashboardReport() 
	{
		objDashboardReports.getDashboardReports();
		//objDashboardReports.getDownload();
	}
	
	@Test
	public void TC_1005_verifyQuotespage()
	{
		objquotes.getQuotesIcon();
		//objquotes.getAllFilters();
		//objquotes.getSearchResults();
		
	}
	
	@Test
	public void TC_1006_verifyDesignpage()
	{
		objDesignPage.getDesignPage();
	}

}

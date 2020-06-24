package com.dhs.ui.pages;

import javax.management.openmbean.OpenDataException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dhs.ui.base.BasePage;

public class HomePage extends BasePage<HomePage>
{
 	private String homePageURL = "https://platform-test.dhsarabia.com.sa/?code=FspqZHPLbbAIGoef5vfkgTPine3oNrmgVjQzbU9VYNQ&locale=en_US&userState=Authenticated";
 	private String elegibilityPageURL = "https://platform-test.dhsarabia.com.sa/Eligiblity";
	
	

	//Initialize the value of the webdriver.
	public HomePage(WebDriver driver)
	{
		super(driver);
	}

	
	public EligibilityPage launchElegibilityPage()
	{
		driver.get(elegibilityPageURL);
		return new EligibilityPage(driver);
	}
	
	public void openHomePage()
	{
		launchPage(homePageURL);
	}



	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}

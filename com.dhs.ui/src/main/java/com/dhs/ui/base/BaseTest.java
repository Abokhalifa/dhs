package com.dhs.ui.base;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.dhs.ui.browser.DriverManager;
import com.dhs.ui.browser.DriverManagerFactory;

public class BaseTest {
	
	
	protected WebDriver driver;
	private DriverManager driverManager;
    

	@Parameters ({"browser"})
	@BeforeTest
	protected void setup(String browser){
		System.out.println("Launch browser. ");
		driverManager = DriverManagerFactory.getManager(browser);
		driver = driverManager.getDriver();
	}
	
	

	@AfterTest 
	protected void tearDown(){
		System.out.println("Tear down. ");
		driverManager.quitDriver();
	}
}


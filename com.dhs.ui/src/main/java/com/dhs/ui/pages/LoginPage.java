package com.dhs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.dhs.ui.base.BasePage;

public class LoginPage extends BasePage<LoginPage>
{
 


	private String loginPageURL = "http://devfauth.dhsarabia.com.sa:9011/oauth2/authorize?client_id=af861d39-8fa9-4a64-8f11-b64dddf929dc&response_type=code&redirect_uri=https%3A%2F%2Fplatform-test.dhsarabia.com.sa&iss=acme.com&sid";	
	
	//Login form
	private By usernameTextbox = By.name("loginId");
	private By passwordTextbox = By.name("password");
	private By loginButton = By.cssSelector("button.btn.btn-primary.glow.w-100.position-relative");
	
	
	public EligibilityPage login (String userNameValue,String passwordValue)
	{
		clear(usernameTextbox);
		type(userNameValue, usernameTextbox);
		clear(passwordTextbox);
		type(passwordValue, passwordTextbox);
		return new EligibilityPage(driver);
	
	}
	
	

	//Initialize the value of the webdriver.
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}

	
	public LoginPage insertUserName(String usernameValue)
	{
		clear(usernameTextbox);
		type(usernameValue, usernameTextbox);
		return this;
		
	}

	public LoginPage insertPassword(String passwordValue)
	{		
		clear(passwordTextbox);
		type(passwordValue, passwordTextbox);
		return this;
		
	}

	public HomePage clickLoginButton()
	{
		
		click(loginButton);
		return new HomePage(driver);
			
	}

	public String getPageTitle()
	{
		String title = driver.getTitle();
		return title;
	}

	public void logindhs (String baseURL,String emailValue,String passwordValue)
	{
		launchPage(baseURL);
		insertUserName(emailValue);
		insertPassword(passwordValue);
		clickLoginButton();
		
	}
	


}

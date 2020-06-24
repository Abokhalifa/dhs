package com.dhs.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.dhs.ui.base.BasePage;
import org.openqa.selenium.support.ui.Select;



/**
 * @author Ahmed.Abokhalifa
 * This class is responsible for identifying the web elements in EligibilityPage page.
 */
public class EligibilityPage extends BasePage<EligibilityPage>
{

	public EligibilityPage(WebDriver driver) {
		super(driver);
	}

	//Login form
	private By userNameTextbox = By.name("loginId");
	private By passwordTextbox = By.name("password");
	

	//MSV/PSV submission form
	private String eligiblityPageURL = "https://platform-test.dhsarabia.com.sa/Eligiblity";
	private Select payerDropdown = new Select (driver.findElement(By.id("InsuranceCompanyId")));
	private By payersCount = By.cssSelector("document.getElementById(\"InsuranceCompanyId\").options.length");
	private By payersList = By.cssSelector("document.getElementById(\"InsuranceCompanyId\").options");
	
	private By nationalIdentityTextbox = By.id("txtNationalID");
	
	private Select specialtyDropdown = new Select (driver.findElement(By.id("slctDep")));
	private Select subSpecialtDropdown = new Select (driver.findElement(By.id("slctSubDep")));
    private By submitButton = By.id("EligSub");
   
    
    

	public void submitMSV_PSV() throws InterruptedException
	{
		System.out.println("I am submittting a new msp/psv");
		selectPayer("SAICO");
		insertNationalIdentity("4512365978");
		selectSpecialty("Dental");
		selectSubspecialty("Endodontics");
		clickSumbitButton();
			
	}

	public EligibilityPage selectPayer(String payerValue) throws InterruptedException
	{
		Thread.sleep(1000);
		payerDropdown.selectByVisibleText(payerValue);
		return this;

	}
	
	public EligibilityPage insertNationalIdentity(String nationalIdentityValue) throws InterruptedException
	{
		clear(nationalIdentityTextbox);
		type(nationalIdentityValue, nationalIdentityTextbox);
		return this;

	}
	
	public EligibilityPage selectSpecialty(String specialtyValue) throws InterruptedException
	{
		Thread.sleep(3000);
		specialtyDropdown.selectByVisibleText(specialtyValue);
		return this;


	}
	
	public EligibilityPage selectSubspecialty(String subspecialtyValue) throws InterruptedException
	{
		Thread.sleep(3000);
		
		subSpecialtDropdown.selectByVisibleText(subspecialtyValue);
		return this;

	}
	
	public EligibilityPage clickSumbitButton() throws InterruptedException
	{
		Thread.sleep(3000);
		click(submitButton);
		return this;

	}

	public String getSpecialtyValueAfterSubmission() throws InterruptedException
	{
		Thread.sleep(5000);		
		WebElement specialtyFieldAfterSumbission= driver.findElement(By.xpath("//div[@class='row']/div[@class='col-md-3'][3]/p"));  
	    String specialtyValueAfterSubmission=specialtyFieldAfterSumbission.getAttribute("innerText");
	    return  specialtyValueAfterSubmission;
		
		

	
	}




}

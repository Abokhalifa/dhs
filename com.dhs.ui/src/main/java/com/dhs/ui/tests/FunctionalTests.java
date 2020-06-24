package com.dhs.ui.tests;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.dhs.ui.base.BaseTest;
import com.dhs.ui.pages.EligibilityPage;
import com.dhs.ui.pages.HomePage;
import com.dhs.ui.pages.LoginPage;




public class FunctionalTests extends BaseTest {
	
	private HomePage homePageObject;
	private EligibilityPage eligibilityPageObject;
	
	
    @Parameters ({"base_URL","username","password"})
    @BeforeClass
    public void loginDHS(String base_URL,String usernameValue,String passwordValue) throws IOException, InterruptedException 
    {
    	LoginPage loginPageObject = new LoginPage(driver);
    	loginPageObject.logindhs(base_URL,usernameValue, passwordValue);
    	
        
    }
    
    @Test(priority=1)
    public void submitSMV_PSV() throws IOException, InterruptedException 
    {
    	homePageObject=new HomePage(driver);
    	homePageObject.openHomePage();
    	homePageObject.launchElegibilityPage();
    	eligibilityPageObject = new EligibilityPage(driver);
    	eligibilityPageObject.submitMSV_PSV();
    
    }
    
    @Test(priority=2)
    public void validateSpecialtyValue() throws InterruptedException
    {
    	String actualSpecialtyValueAfterSubmission = eligibilityPageObject.getSpecialtyValueAfterSubmission();
    	assertEquals(actualSpecialtyValueAfterSubmission, "Dental");
    
    }
    
    


  
 
    



 
  

}
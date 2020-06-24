package com.dhs.ui.utility;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class MiscellaneousFunctions 
{
	   public static String generateRandomEmail()
	    {
	    	
	    	String emailValue = "ahmed.abokhalifasoftxpert+"+RandomStringUtils.randomNumeric(8)+"@gmail.com";
	    	return emailValue;
	    }
	   
	    public static String generateRandomNumber(int numberOfDigits)
	    {
	    	
	    	String usernameValue = RandomStringUtils.randomNumeric(numberOfDigits);
	    	return usernameValue;
	    }
	    
		public static String generateRandomAlphaNumbericString(int count) 
		{
			String randomAlphaNumbericString="1234567890ABCDEFGHIJKLMNOPQRSTUVWZWZ";
			StringBuilder builder = new StringBuilder();
			while (count-- != 0) 
			{
				int character = (int)(Math.random()*randomAlphaNumbericString.length());
				builder.append(randomAlphaNumbericString.charAt(character));
			}
			return builder.toString();
		}
		
		public static String generateRandomNumericString(int count) 
		{
			String randomAlphaNumbericString="123456890";
			StringBuilder builder = new StringBuilder();
			while (count-- != 0) 
			{
				int character = (int)(Math.random()*randomAlphaNumbericString.length());
				builder.append(randomAlphaNumbericString.charAt(character));
			}
			return builder.toString();
		}
	
		public static int getCountOfDropDownItems(WebDriver driver,By dropdown)
		{
			
			
			
			return 0;
		}
		


}

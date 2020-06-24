package com.dhs.ui.browser;

import com.dhs.ui.browser.ChromeDriverManager;
import com.dhs.ui.browser.DriverManager;

public class DriverManagerFactory {


	
    public static DriverManager getManager(String browserType) {

        DriverManager driverManager;
        
    	switch (browserType.toLowerCase()) {
		case "chrome":
			driverManager = new ChromeDriverManager();
			break;
	
			
		   default:
			driverManager = new ChromeDriverManager();
		}
        return driverManager;

    }
}
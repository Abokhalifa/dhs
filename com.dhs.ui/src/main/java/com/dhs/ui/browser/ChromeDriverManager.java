package com.dhs.ui.browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


public class ChromeDriverManager extends DriverManager {

    //private ChromeDriverService chService;
    private String driverPath = "src\\main\\resources\\chromedriver.exe";


    @Override
    public void createDriver() 
    {		
//    	    System.out.println("Launching Chrome browser..");
//	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//	        ArrayList<String> switches = new ArrayList<String>();    
//	        switches.add("--proxy-server=localhost:8080");
//	        capabilities.setCapability("chrome.switches", switches);
//	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("test-type");
//	        options.addArguments("start-maximized");
//	        Map<String, Object> prefs = new HashMap<String,Object>();
//	        prefs.put("profile.block_third_party_cookies", true);
//	        options.setExperimentalOption("prefs",prefs);
//	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//	        System.setProperty("webdriver.chrome.driver", driverPath);
//	        driver = new ChromeDriver(capabilities);
//	        driver.manage().window().maximize();
    	
    	 System.out.println("Launching Chrome browser..");
	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("test-type");
	        options.addArguments("--start-maximized");
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        System.setProperty("webdriver.chrome.driver", driverPath);
	        driver = new ChromeDriver(capabilities);
	        //driver.manage().window().maximize();
	       
	       
	    
	
    }

}
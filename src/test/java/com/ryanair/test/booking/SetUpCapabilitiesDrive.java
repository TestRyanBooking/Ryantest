package com.ryanair.test.booking;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.*; 
import org.openqa.selenium.firefox.FirefoxDriver;


public class SetUpCapabilitiesDrive {

	protected static WebDriver driver = null;
	
	@BeforeClass
	public static void setUpTestsCapabilitiesDrive() {

		System.out.println("SetUpCapabilitiesDrive - @BeforeClass - entro");

		driver =  (WebDriver) new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	    // And now use this to visit Ryanair
	    //driver.get("https://www.ryanair.com/ie/en/"); // Alternatively the same thing can be done like this driver.navigate().to("http://www.google.com");

	    //20190506 saco de un tutorial https://www.youtube.com/watch?v=WzuJANOPLyQ
	    // https://www.youtube.com/watch?v=gwkv6os1AYs&list=PL9ooVrP1hQOFP9H8Y15DVGCA6GavhgJ8a&index=5&t=0s

	}
	
    @After
    public void cleanUp(){
		System.out.println("SetUpCapabilitiesDrive - @After - entro");
        driver.manage().deleteAllCookies();
    }
    
    @AfterClass
    public static void tearDown(){
		System.out.println("SetUpCapabilitiesDrive - @AfterClass - entro");
        driver.close();
    }

}

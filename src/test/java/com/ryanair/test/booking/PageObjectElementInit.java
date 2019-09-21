	package com.ryanair.test.booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectElementInit {
    protected WebDriver driver;

    public PageObjectElementInit(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}

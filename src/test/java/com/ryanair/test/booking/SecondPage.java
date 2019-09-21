package com.ryanair.test.booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage extends PageObjectElementInit {

	// In order to use the PageFactory, first declare some fields on a PageObject that are WebElements
	@FindBy(css="flights-table-price:nth-child(1) .core-btn-primary")
	private WebElement firstLineFlightsTable;

	@FindBy(css=".standard .flights-table-fares__fare-radio")
	private WebElement standardFareRadio;
	
	public SecondPage(WebDriver driver) {
		super(driver);
	}

	public void clickFirstLineFlightsTable () {
		System.out.println("clickFirstLineFlightsTable - entro");
		this.firstLineFlightsTable.click();
		System.out.println("clickFirstLineFlightsTable - hizo click");
	}
	
	public ThirdPage clickStandardFareRadio () {
		System.out.println("clickStandardFareRadio - entro");
		this.standardFareRadio.click();
		System.out.println("clickStandardFareRadio - hizo click");
		return new ThirdPage(driver);

	}
	
}

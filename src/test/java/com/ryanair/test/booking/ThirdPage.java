package com.ryanair.test.booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage extends PageObjectElementInit {

	// In order to use the PageFactory, first declare some fields on a PageObject that are WebElements
	@FindBy(id="continue")
	private WebElement continueFlightSelectBtn;

	public ThirdPage(WebDriver driver) {
		super(driver);
	}
	
	public FourthPageSeatSelect continueFlightSelectBtn() {
		System.out.println("continueFlightSelectBtn - entro");
		this.continueFlightSelectBtn.click();
		return new FourthPageSeatSelect(driver);
	}

}

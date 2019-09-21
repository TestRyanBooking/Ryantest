package com.ryanair.test.booking;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FourthPageSeatSelect extends PageObjectElementInit {

	
	@FindBy(css=".footer-message-content__button--link > span")
	private WebElement pageSeatRndBtn;

	
	public FourthPageSeatSelect(WebDriver driver) {
		super(driver);
	}

	public FifthCabinBagPage clickPageSeatRndBtn() {
		// RFS this.pageSeat.sendKeys(Keys.ESCAPE);
		System.out.println("SeatPage - clickPageSeatRndBtn RANDOM- entro");
		this.pageSeatRndBtn.click();
		return new FifthCabinBagPage(driver);
	}
	
}

package com.ryanair.test.booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SixthPageExtra extends PageObjectElementInit {

	@FindBy(css=".core-btn-primary > span")
	private WebElement extraPageCheckOutBtn;
	
	@FindBy(css=".popup-msg__button--cancel")
	private WebElement extraPageChooseRndLocationBtn;
	
	public SixthPageExtra(WebDriver driver) {
		super(driver);
	}
	
	public void clickExtraPageCheckOutBtn() {
		System.out.println("SixthPageExtra - clicksmallBagContinueBtn - entro");
		this.extraPageCheckOutBtn.click();
		//return new SeatSelectPage(driver);
	}

	public SeventhPagePayment clickExtraPageChooseRndLocationBtn() {
		System.out.println("SixthPageExtra - extraPageChooseRndLocationBtn - entro");
		this.extraPageChooseRndLocationBtn.click();
		//return new SeatSelectPage(driver);
		return new SeventhPagePayment(driver);
	}

}

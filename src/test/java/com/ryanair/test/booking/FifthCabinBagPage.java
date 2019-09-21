package com.ryanair.test.booking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FifthCabinBagPage extends PageObjectElementInit {

	
	@FindBy(css=".pb-cb-card-wrapper:nth-child(1) .pb-cb-standalone-card__footer label")
	private WebElement smallBugRadioBtn;

	@FindBy(css=".core-btn-primary:nth-child(2) > span")
	private WebElement smallBagContinueBtn;
	
	public FifthCabinBagPage(WebDriver driver) {
		super(driver);
	}

	public void clickSmallBagRadioBtn() {
		System.out.println("CabinBagPage - clickSmallBagRadioBtn- entro");
		this.smallBugRadioBtn.click();
	}

	public SixthPageExtra clicksmallBagContinueBtn() {
		System.out.println("CabinBagPage - clicksmallBagContinueBtn - entro");
		this.smallBagContinueBtn.click();
		return new SixthPageExtra(driver);
	}

}

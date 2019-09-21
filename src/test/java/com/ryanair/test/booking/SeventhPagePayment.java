package com.ryanair.test.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SeventhPagePayment extends PageObjectElementInit {

	private Select titlePayment;
	private WebElement firstNamePayment;
	private WebElement surNamePayment;

	@FindBy(css=".csi-card__btn")
	private WebElement noInsuranceBtnPayment;

	private Select mobilePhoneCountryPayment;

	@FindBy(css=".ng-invalid-valid-phone-number:nth-child(2)")
	private WebElement mobileNumberPayment;
	
	private WebElement cardNumberPayment;
	private Select expiryMonthPayment;
	private Select expiryYearPayment;
	
	@FindBy(name="securityCode")
	private WebElement cardSecurityNumberPayment;
	
	@FindBy(name="cardHolderName")
	private WebElement cardHolderNamePayment;
	
	private Select currencyPayment;
	
	@FindBy(id="billingAddressAddressLine1")
	private WebElement billingAddressPayment;
	
	@FindBy(id="billingAddressCity")
	private WebElement billingAddressCityPayment;

	@FindBy(id="billingAddressPostcode")
	private WebElement billingZipPayment;
	
	//@FindBy(id="billingAddressCountry")
	private Select billingCountryPayment;
	
	private WebElement conditionsTermsCheckBoxPayment;
	
	@FindBy(css=".core-btn-medium")
	private WebElement payBtnPayment;

	@FindBy(xpath="//div[@id='checkout']/div/form/div/div[3]/div[2]/payment-details-form/div/div[2]/prompt/div[2]")
	private WebElement paymentErrorMessage;
	
	public SeventhPagePayment(WebDriver driver) {
		super(driver);
	}
	
	public void selectMr() {
		System.out.println("SeventhPagePayment - selectMr");
		titlePayment = new Select(driver.findElement(By.xpath("//select[starts-with(@id,'title')]")));
		titlePayment.selectByIndex(0);
	}

	public void enterPassangerName(String name) {
		System.out.println("SeventhPagePayment - enterPassangerName");
		firstNamePayment = driver.findElement(By.xpath("//input[starts-with(@id,'firstName')]"));
		firstNamePayment.sendKeys(name);
	}

	public void enterPassangerSurName(String surName) {
		System.out.println("SeventhPagePayment - enterPassangerSurName");
		surNamePayment = driver.findElement(By.xpath("//input[starts-with(@id,'lastName')]"));
		surNamePayment.sendKeys(surName);
	}
	
	public void clickInsuranceBtn() {
		System.out.println("SeventhPagePayment - clickNoInsuranceBtn");
		noInsuranceBtnPayment.click();
	}

	public void selectPhoneCountry() throws InterruptedException {
		System.out.println("SeventhPagePayment - selectPhoneCountry");
		mobilePhoneCountryPayment = new Select(driver.findElement(By.name("phoneNumberCountry")));
		//mobilePhoneCountryPayment.selectByVisibleText("Spain");
		mobilePhoneCountryPayment.selectByIndex(33);
	}

	public void enterPhoneNumber (String number) {
		System.out.println("SeventhPagePayment - enterPhoneNumber");
		mobileNumberPayment.click();
		mobileNumberPayment.sendKeys(number);
	}

	public void enterCardNumber(String cardNumber) {
		System.out.println("SeventhPagePayment - enterCardNumber");
		cardNumberPayment = driver.findElement(By.xpath("//input[starts-with(@id,'cardNumber')]"));
		cardNumberPayment.sendKeys(cardNumber);
	}

	public void selectMonthExp() {
		System.out.println("SeventhPagePayment - selectMonthExp");
		expiryMonthPayment = new Select(driver.findElement(By.xpath("//select[starts-with(@id,'expiryMonth')]"))); 
		expiryMonthPayment.selectByIndex(11);
	}

	public void selectYearExp() {
		System.out.println("SeventhPagePayment - selectYearExp");
		expiryYearPayment = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'expiryYear')]"))); 
		expiryYearPayment.selectByIndex(2);
	}

	public void enterSecurityCode(String codeExp) {
		System.out.println("SeventhPagePayment - enterSecurityCode");
		cardSecurityNumberPayment.click();
		cardSecurityNumberPayment.sendKeys(codeExp);
	}

	public void enterCardHolderName (String nameCard) {
		System.out.println("SeventhPagePayment - enterCardHolderName");
		cardHolderNamePayment.click();
		cardHolderNamePayment.sendKeys(nameCard);
	}

	public void selectCurrency (String currency) {
		System.out.println("SeventhPagePayment - selectCurrency");
		currencyPayment = new Select(driver.findElement(By.xpath("//select[starts-with(@name,'currency')]"))); //RFS Cambiar por contains
		currencyPayment.selectByIndex(1);
	}
	
	public void enterBillingAddress (String billingAdr) {
		System.out.println("SeventhPagePayment - enterbillingAddress");
		billingAddressPayment.click();
		billingAddressPayment.sendKeys(billingAdr);
	}
	
	public void enterBillingCity (String billingCity) {
		System.out.println("SeventhPagePayment - enterBillingCity");
		billingAddressCityPayment.click();
		billingAddressCityPayment.sendKeys(billingCity);
	}
	
	public void enterBillingZip (String billingZip) {
		System.out.println("SeventhPagePayment - enterBillingZip");
		billingZipPayment.click();
		billingZipPayment.sendKeys(billingZip);
		billingZipPayment.sendKeys(Keys.TAB);
	}
	
	public void selectBillingCountry() {
		System.out.println("SeventhPagePayment - selectBillingCountryPayment");
		billingCountryPayment = new Select(driver.findElement(By.xpath("//select[starts-with(@id,'billingAddressCountry')]"))); //RFS Cambiar por contains
		currencyPayment.selectByIndex(10);		
	}
	
	public void checkConditions () {
		System.out.println("SeventhPagePayment - checkConditions");
		conditionsTermsCheckBoxPayment = driver.findElement(By.cssSelector(".terms use"));
		billingZipPayment.sendKeys(Keys.SPACE);
		//System.out.println("getText: " + conditionsTermsCheckBoxPayment.getText());
		//System.out.println("isDisplayed: " + String.valueOf(conditionsTermsCheckBoxPayment.isDisplayed()));
		//System.out.println("getAttribute(\"checked\"): " + String.valueOf(conditionsTermsCheckBoxPayment.getAttribute("checked")));
	}
 
	public void clickPayButton() {
		System.out.println("SeventhPagePayment - clickPayButton");
		payBtnPayment.click();
	}
	
    public String getPaymentErrorMessage() {
		System.out.println("SeventhPagePayment - getPaymentErrorMessage");
    	paymentErrorMessage.click();
    	System.out.println("SeventhPagePayment - CLICK PAY");
        return paymentErrorMessage.getText();
    }
	
}

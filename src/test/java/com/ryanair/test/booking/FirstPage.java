package com.ryanair.test.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class FirstPage extends PageObjectElementInit {

	// In order to use the PageFactory, first declare some fields on a PageObject that are WebElements

	@FindBy(css="#myryanair-auth-login .username")
	private WebElement loginBtn;
	
	@FindBy(id="flight-search-type-option-one-way")
	private WebElement oneWayRadioButton;
	
	private WebElement cookieMessage;
	
	@FindBy(xpath="/html/body/div[2]/main/article/div[2]/smart-search/div/div[2]/div[1]/div[1]/div/form/div[2]/div/div/div[1]/div[2]/div[2]/div/div[1]/input")
	private WebElement departureAirport;
	
	@FindBy(xpath="/html/body/div[2]/main/article/div[2]/smart-search/div/div[2]/div[1]/div[1]/div/form/div[2]/div/div/div[3]/div[2]/div[2]/div/div[1]/input") //css=.disabled-wrap > .ng-empty //css=.disabled-wrap > .ng-not-empty
	private WebElement destinationAirport;
	
	@FindBy(xpath="/html/body/div[2]/main/article/div[2]/smart-search/div/div[2]/div[1]/div[1]/div/form/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/div[2]/div/input[1]")
	private WebElement departureDay;

	@FindBy(xpath="/html/body/div[2]/main/article/div[2]/smart-search/div/div[2]/div[1]/div[1]/div/form/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/div[2]/div/input[2]")
	private WebElement departureMonth;

	@FindBy(xpath="/html/body/div[2]/main/article/div[2]/smart-search/div/div[2]/div[1]/div[1]/div/form/div[2]/div[2]/div[1]/div/div[1]/div/div[2]/div[2]/div/input[3]")
	private WebElement departureYear;
	
	@FindBy(className="dropdown-handle")
	private WebElement passangersDropDown;

	@FindBy(xpath="/html/body/div[2]/main/article/div[2]/smart-search/div/div[2]/div[1]/div[1]/div/form/div[4]/button[2]")
	private WebElement continueButton;
	
		
    public FirstPage(WebDriver driver) {
        super(driver);
    }
    
    public void closeCookieMessage() {
    	cookieMessage = driver.findElement(By.cssSelector("div > #glyphs\\.close > path"));
    	cookieMessage.click();
    }
    
	public LoginPage clickLoginBtn () {
		this.loginBtn.click();
		return new LoginPage(driver);
	}
		
	public boolean oneWayIsShowed() {
		return oneWayRadioButton.isDisplayed();
	}
	
	public void oneWayClick() {
		//this.oneWayRadioButton.clear();
		this.oneWayRadioButton.click();
	}
	
	public void enterDepartureAirport(String city){
		System.out.println("enterDepartureAirport - called");
		this.departureAirport.click();
		System.out.println("enterDepartureAirport - hizo click");
		this.departureAirport.sendKeys(city);
		System.out.println("enterDepartureAirport - hizo sendKeys");
	}

	
	public void enterDestinationAirport(String city){
		System.out.println("enterDestinationAirport - called");
		
		this.destinationAirport.click();
		System.out.println("enterDestinationAirport - click");
		this.destinationAirport.sendKeys(city);
		System.out.println("enterDestinationAirport - sendKeys");
		this.destinationAirport.sendKeys(Keys.TAB);
	}
	
	public void enterDepartureDay (String day){
		System.out.println("enterDepartureDay - called");
		this.departureDay.click();
		System.out.println("enterDepartureDay - click");
		this.departureDay.clear();
		System.out.println("enterDepartureDay - clear");
		this.departureDay.sendKeys(day);
		System.out.println("enterDepartureDay - sendKeys");
	}
	
	public void enterDepartureMonth (String month){
		System.out.println("enterDepartureMonth - called");
		this.departureMonth.click();
		System.out.println("enterDepartureMonth - click");
		this.departureMonth.clear();
		System.out.println("enterDepartureMonth - clear");
		this.departureMonth.sendKeys(month);
		System.out.println("enterDepartureMonth - sendKeys");
	}

	public void enterDepartureYear (String year){
		System.out.println("enterDepartureYear - called");
		this.departureYear.click();
		System.out.println("enterDepartureYear - click");
		this.departureYear.clear();
		System.out.println("enterDepartureYear - clear");
		this.departureYear.sendKeys(year);
		System.out.println("enterDepartureYear - sendKeys");
	}
	
	public void addPassangers() {
		System.out.println("addPassangers - called");
		this.passangersDropDown.click();
		System.out.println("addPassangers - click");
	}

	public SecondPage clickContinueBtn() {
		System.out.println("clickContinueBtn - called");
		this.continueButton.click();
		System.out.println("clickContinueBtn - hizo click");
		return new SecondPage(driver);
	}
	
}

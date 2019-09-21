package com.ryanair.test.booking;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends PageObjectElementInit {

	@FindBy(name="emailAddress")
	private WebElement usernameEditBox;


	// RFS dont work x nro  @FindBy(id="password371")
	// RFS dont work @FindBy(className="form-field password")
	
	// RFS @FindBy(how = How.ID, using = "password")
	// RFS @FindBy(css="[id^='password']")
	// RFS @FindBy(className="form-field password")
	// RFS @FindBy(name="password")
	// xpath=//input[@id='password946']
	// div[contains(@id,'post-body-')]/div[1]/form[1]/input[1]
	
	//the next line work fine, but 
	@FindBy(xpath="//div[@id='ngdialog1']/div[2]/signup-home-form/div/div/div[2]/div/dialog-body/div[2]/signup-home-tabs/div[2]/div/div/div/form/div[2]/password-input/input")
	private WebElement passwordEditBox;

	@FindBy(css=".modal-form-group translate")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	
	public void enterMail (String mail){
		System.out.println("LoginPage - enterMail - entro");
		this.usernameEditBox.click();
		System.out.println("LoginPage - enterMail - hizo click");
		this.usernameEditBox.clear();
		System.out.println("LoginPage - enterMail - hizo clear");
		this.usernameEditBox.sendKeys(mail);
		System.out.println("LoginPage - enterMail - hizo sendKeys");
		usernameEditBox.sendKeys(Keys.TAB);
	}


	public void enterPassword (String pass){
		System.out.println("LoginPage - enterPassword - entro");
		//passwordEditBox = driver.findElement(By.xpath("//input[starts-with(@id,'password')]"));
		System.out.println(String.valueOf(passwordEditBox.isEnabled()));
		System.out.println(String.valueOf(passwordEditBox.isSelected()));
		passwordEditBox.click();
		System.out.println("LoginPage - enterPassword - hizo click");
		passwordEditBox.clear();
		System.out.println("LoginPage - enterPassword - hizo clear");
		passwordEditBox.sendKeys(pass);
		System.out.println("LoginPage - enterPassword - hizo sendKeys");
	}
	
	
	public FirstPage clickLoginBtn() {
		System.out.println("LoginPage - clickLoginBtn - entro");
		this.loginBtn.click();
		System.out.println("LoginPage - clickLoginBtn - hizo click");
		return new FirstPage(driver);
	}


}

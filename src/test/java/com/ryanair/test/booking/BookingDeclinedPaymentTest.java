package com.ryanair.test.booking;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.hamcrest.core.IsEqual;
import org.junit.Rule;
import org.junit.Test;

public class BookingDeclinedPaymentTest extends SetUpCapabilitiesDrive {
	    
		@Rule
		public ErrorCollector collector = new ErrorCollector();
	
		@Test
		public void declinePayment() throws Exception {
			try {

			    driver.get("https://www.ryanair.com/ie/en/");
			    Actions action = new Actions(driver);
				FirstPage firstPage = new FirstPage(driver);
				Thread.sleep(10000);
				driver.manage().window().maximize();

				firstPage.closeCookieMessage();
				LoginPage loginPage = firstPage.clickLoginBtn();
				Thread.sleep(2000);
				loginPage.enterMail("mferrer0976@gmail.com");
				loginPage.enterPassword("Polito22");
				loginPage.clickLoginBtn();
				Thread.sleep(5000);
				
		        firstPage.oneWayClick();
		        firstPage.enterDepartureAirport("Madrid");
		        firstPage.enterDestinationAirport("Dublin");
		        firstPage.enterDepartureDay("25");
		        firstPage.enterDepartureMonth("10");
		        firstPage.enterDepartureYear("2019");
		        firstPage.addPassangers();
		        
		        SecondPage secondPage = firstPage.clickContinueBtn();
		        Thread.sleep(10000);
		        secondPage.clickFirstLineFlightsTable();
		        Thread.sleep(5000);
		        ThirdPage thirdPage = secondPage.clickStandardFareRadio();
		        Thread.sleep(5000);
		        
		        FourthPageSeatSelect fourthSeatSelectPage = thirdPage.continueFlightSelectBtn();
		        Thread.sleep(5000);
      
		        FifthCabinBagPage fifthCabinBagPage = fourthSeatSelectPage.clickPageSeatRndBtn();
		        Thread.sleep(5000);
		        fifthCabinBagPage.clickSmallBagRadioBtn();

		        SixthPageExtra sixthPageExtra = fifthCabinBagPage.clicksmallBagContinueBtn();
		        Thread.sleep(5000);
		        sixthPageExtra.clickExtraPageCheckOutBtn();
		        Thread.sleep(5000);
		        SeventhPagePayment seventhPagePay = sixthPageExtra.clickExtraPageChooseRndLocationBtn();		        
		        Thread.sleep(5000);
		        
		        seventhPagePay.selectMr();
		        seventhPagePay.enterPassangerName("Miguel");
		        seventhPagePay.enterPassangerSurName("Ferrer");
		        Thread.sleep(5000);
		        seventhPagePay.clickInsuranceBtn();
		        seventhPagePay.selectPhoneCountry();
		        seventhPagePay.enterPhoneNumber("622987123");
		        seventhPagePay.enterCardNumber("5555555555555557");
		        Thread.sleep(5000);
		        seventhPagePay.selectMonthExp();
		        seventhPagePay.selectYearExp();
		        seventhPagePay.enterSecurityCode("265");
		        Thread.sleep(2000);
		        seventhPagePay.enterCardHolderName("Miguel Ferrer");
		        Thread.sleep(5000);
		        seventhPagePay.selectCurrency("1");
		        seventhPagePay.enterBillingAddress("Cl Fca Montseny 35");
		        seventhPagePay.enterBillingCity("Madrid");
		        seventhPagePay.enterBillingZip("28100");
		        Thread.sleep(2000);
		        action.sendKeys(Keys.TAB).perform();
		        Thread.sleep(2000);
		        //Check Conditions
		        action.sendKeys(Keys.SPACE).perform(); 
		        Thread.sleep(1000);
		        seventhPagePay.clickPayButton();
		        Thread.sleep(5000);

		        // I use "collector" to add a failure without stop the test. 
		        collector.checkThat("checkThat Message Error Card", 
		        		seventhPagePay.getPaymentErrorMessage(), 
		        		IsEqual.equalTo("As your payment was not authorised we could not complete your reservation. Please ensure that the information was correct or use a new payment to try again"));
		        
		        System.out.println("Test BookingDeclinedPaymentTest - completed");
				Thread.sleep(10000);

			} catch (Exception e) {
	        	System.out.println("BookingDeclinedPaymentTest - Exception: " + String.valueOf(e));
	        	fail("EXCEPTION - TEST BookingDeclinedPaymentTest");
			}
		}

}

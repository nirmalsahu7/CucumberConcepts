package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckOutPage;
import pageObjects.LandingPage;
import utils.PaymentInstruction;
import utils.TestContextSetup;

public class CheckOutPageStepDefinition {

	public TestContextSetup testContextSetup;
	CheckOutPage checkOutPage;
	
	
	public CheckOutPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.checkOutPage =testContextSetup.pageObjectManager.getCheckOutPage();
	}
	

	
	@Then("verify user has ability to enter promo code and place the order")
	public void user_has_ability_to_enter_promocode() throws InterruptedException {
		//System.out.println("when executed");
	
		//CheckOutPage checkOutPage=testContextSetup.pageObjectManager.getCheckOutPage();
		
		Assert.assertTrue(checkOutPage.verifyPromoBtn());
		Assert.assertTrue(checkOutPage.verifyPlaceOrder());
		
		Thread.sleep(5000);
		//System.out.println("when executed");


		
	}
	
	
	@Then("^user proceed to Checkout and validate the (.+) items in checkout page$")
	public void user_proceed_to_checkout(String name) throws InterruptedException {
		
	

		
		checkOutPage.checkOutitems();
		Thread.sleep(5000);
		//System.out.println("when executed");


		
	}


}

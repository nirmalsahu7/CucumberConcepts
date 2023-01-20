package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.PaymentInstruction;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	//public WebDriver driver;
	//public String homePageProductName;
	//public String offerPageProductName;
	public TestContextSetup testContextSetup;
	LandingPage landingPage;
	//public PaymentInstruction pi=new PaymentInstruction();
	
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
		this.landingPage =testContextSetup.pageObjectManager.getLandingPage();
	}
	
	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() {

		System.out.println("given executed");

		testContextSetup.pageObjectManager.getLandingPage();
	}
	
	//@When("user search with shortname {string} and extracted actual name or the product")
	public void user_search_with_shortname_and_extracted_actual_name_or_the_product(String shortName) throws InterruptedException {
		System.out.println("when executed");
	
		LandingPage landingPage=testContextSetup.pageObjectManager.getLandingPage();
		
		landingPage.searchItem(shortName);
		Thread.sleep(5000);
		testContextSetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
		
		
		
		System.out.println(testContextSetup.landingPageProductName+" is extracted from home page");

		
	}
	
	
	
	@When("^user search with shortname (.+) and extracted actual name or the product$")
	public void user_search_with_shortname_and_extracted_actual_name_or_the_productSO(String shortName) throws InterruptedException {
		System.out.println("when executed");
	
		LandingPage landingPage=testContextSetup.pageObjectManager.getLandingPage();
		
		landingPage.searchItem(shortName);
		Thread.sleep(5000);
		testContextSetup.landingPageProductName = landingPage.getProductName().split("-")[0].trim();
		
		
		
		System.out.println(testContextSetup.landingPageProductName+" is extracted from home page");

		
	}
	
	
	@Given("I set traceId as {string}")
	public void iSetTreaceId(String traceId) {
		System.out.println(" traceId before set-"+testContextSetup.pi.traceId);
		
		testContextSetup.pi.traceId=traceId;
		
		System.out.println(" traceId after set in landing page-"+testContextSetup.pi.traceId);
		

		
	}
	
	@And("Added {string} items of selected product to cart")
	public void addToCard(String qqty) {
	
			landingPage.incremntQqty(Integer.parseInt(qqty));
			landingPage.addtoCart();
		
	}
	
	

}

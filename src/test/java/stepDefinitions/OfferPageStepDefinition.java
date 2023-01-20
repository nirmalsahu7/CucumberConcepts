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
import pageObjects.OfferPage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	//public WebDriver driver;
	//public String homePageProductName;
	public String offerPageProductName;
	public TestContextSetup testContextSetup;
	public PageObjectManager pageObjectManager;
	
	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup=testContextSetup;
	}

	//@Then("user searched for {string} shortname in offer page")
	public void user_searched_for_same_shortname_in_offer_page(String shortName) throws InterruptedException {
		switchToOfferPage();
		OfferPage offerPage=testContextSetup.pageObjectManager.getOfferPage();
		offerPage.searchItem(shortName);
		Thread.sleep(5000);
		offerPageProductName=offerPage.getProductName();
		System.out.println(offerPageProductName+" is extracted from offer page**");
		System.out.println("then executed");
	}

	@Then("^user searched for (.+) shortname in offer page$")
	public void user_searched_for_same_shortname_in_offer_pageSO(String shortName) throws InterruptedException {
		switchToOfferPage();
		OfferPage offerPage=testContextSetup.pageObjectManager.getOfferPage();
		offerPage.searchItem(shortName);
		Thread.sleep(5000);
		offerPageProductName=offerPage.getProductName();
		System.out.println(offerPageProductName+" is extracted from offer page**");
		System.out.println("then executed");
	}
	
	
	public void switchToOfferPage() {
		
		LandingPage landingPage=testContextSetup.pageObjectManager.getLandingPage();
		
		landingPage.selectTopDealsPage();	
		testContextSetup.genericUtils.switchTochildWindow();
		

		
	}
	@And("Validate product name is matched in home page and offer page")
	public void Validate_product_name_is_matched_in_homepage_and_offerpage() {
		System.out.println("offerPageProductName- "+offerPageProductName);
		System.out.println("testContextSetup.landingPageProductName- "+testContextSetup.landingPageProductName);
		Assert.assertEquals(offerPageProductName, testContextSetup.landingPageProductName);
		System.out.println("And then executed");
	}

	@Then("I access traceId in other page")
	public void getValue() {
		
		
		System.out.println("in offer page traceId-"+testContextSetup.pi.traceId);
	}
	
}

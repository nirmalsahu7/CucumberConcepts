package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	public WebDriver driver;
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	//By cartBag=By.xpath("//input[@type='search']");
	//By cartBag=By.cssSelector("alt='Card'");
	
	By cartBag=By.xpath("//img[@alt='Cart']");
	By checkOutButton=By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	By promobtn=By.cssSelector(".promoBtn");
	By placeOrder=By.xpath("//button[normalize-space()='Place Order']");
	
	public void checkOutitems() {
		driver.findElement(cartBag).click();
		driver.findElement(checkOutButton).click();
	}
	
	public Boolean verifyPromoBtn() {
		
		return driver.findElement(promobtn).isDisplayed();
	}
	
	public Boolean verifyPlaceOrder() {
		
		return driver.findElement(placeOrder).isDisplayed();
	}
}

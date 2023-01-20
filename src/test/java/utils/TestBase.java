package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	


	public WebDriver WebDriverManager() {
	
		if(driver==null) {
	System.setProperty("webdriver.chrome.driver", "/Users/nirmalsahu/Documents/Selenium Set Up/chromedriver");
	driver= new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	return driver;
	}
}

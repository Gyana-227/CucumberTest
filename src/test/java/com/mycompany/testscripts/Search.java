package com.mycompany.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	 WebDriver driver=null;
	@Given("Browser is open")
	public void browser_is_open() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gyana\\git\\CucumberTest\\src\\test\\resources\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 
	  
	}

	@Given("user is in google search page")
	public void user_is_in_google_search_page() {
		driver.navigate().to("https://google.com");
		
	  
	}

	@When("user enter text in search box")
	public void user_enter_text_in_search_box() {
	  driver.findElement(By.xpath("//input[@name='q']")).sendKeys("gyana")  ;
	}

	@When("hits enter")
	public void hits_enter() {
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	}

	@Then("search result should get displayed")
	public void search_result_should_get_displayed() {
	    
	driver.close();
	driver.quit();
	}


}

package com.mycompany.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver=null;
	@Given("user on login screen")
	public void user_on_login_screen() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gyana\\git\\CucumberTest\\src\\test\\resources\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("user given valid and")
public void user_given_valid_and() {
		driver.findElement(By.id("name")).sendKeys("Gyana");
		driver.findElement(By.id("password")).sendKeys("12345");
		
	}

	@When("user click on login buttion")
	public void user_click_on_login_buttion() {
		 driver.findElement(By.id("login")).click();
	}

	@Then("user should land on home screen")
	public void user_should_land_on_home_screen() {

System.out.println(driver.findElement(By.id("greetings")).getText());

System.out.println(driver.findElement(By.id("logout")).isDisplayed());
driver.findElement(By.id("logout")).click();
driver.close();
driver.quit();

	}

}

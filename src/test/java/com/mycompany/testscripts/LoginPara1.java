package com.mycompany.testscripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mycompany.Pages.LoginParaPOM;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPara1 {
WebDriver driver=null;
LoginParaPOM login;
@Given("browser is open")
public void browser_is_open() {
	
	System.out.println("we are inside POM ===");
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gyana\\git\\CucumberTest\\src\\test\\resources\\Drivers\\chromedriver.exe");
	 driver = new ChromeDriver();

}

@And("user is in login page")
public void user_is_in_login_page() {
	
	 driver.navigate().to("https://example.testproject.io/web/");
}

@When("^user enter (.*) and (.*)$")
public void user_enter_valid_username_and_password(String username, String password) {
	
	login= new LoginParaPOM(driver);
	login.enterUsername(username);
	login.enterPassword(password);
	
	//driver.findElement(By.id("name")).sendKeys(username);
	//driver.findElement(By.id("password")).sendKeys(password);
}

@And("click on login")
public void click_on_login() {
	login.clickLogin();
	
	// driver.findElement(By.id("login")).click();
}

@Then("home page should get displayed")
public void home_page_should_get_displayed() {
	System.out.println(driver.findElement(By.id("greetings")).getText());
	System.out.println(driver.findElement(By.id("logout")).isDisplayed());
	driver.findElement(By.id("logout")).click();
	driver.close();
	driver.quit();
   
}

}
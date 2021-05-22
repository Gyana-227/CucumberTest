package com.mycompany.testscripts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	
	@Given("user on login screen")
	public void user_on_login_screen() {
		 System.out.println("step1");
	}

	@When("user given valid and")
	public void user_given_valid_and() {
		 System.out.println("step2");
	}

	@When("user click on login buttion")
	public void user_click_on_login_buttion() {
		 System.out.println("step3");
	}

	@Then("user should land on home screen")
	public void user_should_land_on_home_screen() {
	    System.out.println("step4");
	}

}

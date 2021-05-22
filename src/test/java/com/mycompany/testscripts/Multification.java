package com.mycompany.testscripts;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Multification {
	@Given("{int} numbers")
	public void numbers(Integer int1) {
	 int a=5;
	 int b=7;
	}

	@When("multiply {int} number")
	public void multiply_number(Integer int1,Integer int2) {
	
		System.out.println(int1*int2);
	}



}

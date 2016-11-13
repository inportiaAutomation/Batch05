package com.inportia.EmpoweringIndia.stepDefs;

import com.inportia.EmpoweringIndia.pageObject.HomePageObject;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomePageStep {
    
	HomePageObject home_obj = new HomePageObject();
	
	@When("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
      home_obj.go_to_empowering_India();
	}

	@Given("^user clicks on find your party$")
	public void user_clicks_on_find_your_party() throws Throwable {


	}

	@Given("^user clicks on \"([^\"]*)\" letter$")
	public void user_clicks_on_letter(String arg1) throws Throwable {
          System.out.println(arg1);
	}

	@Then("^user must find \"([^\"]*)\"$")
	public void user_must_find(String arg1) throws Throwable {
		 System.out.println(arg1);

	}


	
}

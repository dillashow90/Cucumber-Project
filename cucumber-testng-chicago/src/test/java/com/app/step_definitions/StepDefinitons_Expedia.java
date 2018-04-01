package com.app.step_definitions;

import org.openqa.selenium.WebDriver;

import com.app.pages.ExpediaPageClass;
import com.app.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitons_Expedia {

	private WebDriver driver = Driver.getDriver();	
	ExpediaPageClass page = new ExpediaPageClass();
	
	

@Given("^go to UrlExpedia and look for a ticket$")
public void go_to_UrlExpedia_and_look_for_a_ticket() {
   
   
}

@Given("^Apply city and fill up the blanks$")
public void apply_city_and_fill_up_the_blanks() {
   
}

@Then("^click the search button$")
public void click_the_search_button() {
    
}

@Then("^save a results$")
public void save_a_results() {
   
}
}

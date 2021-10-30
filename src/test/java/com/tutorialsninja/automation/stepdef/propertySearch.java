package com.tutorialsninja.automation.stepdef;

import org.apache.log4j.Logger;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.landingPage;

import io.cucumber.java.en.*;


public class propertySearch {
	
	private static Logger log = Logger.getLogger(AIvaluation.class);
	landingPage landingpage =  new landingPage();

	
	@Given("^I Launch the Landing page$")
	public void i_Launch_the_Landing_page() throws Throwable {
		
		Base.driver.get(Base.reader.getUrl());
	}

	@When("^I give location Mortgare and yeild$")
	public void i_give_location_Mortgare_and_yeild() throws Throwable {
		Elements.TypeText(landingPage.searchLocation, "canary wharf");
		Elements.click(landingPage.deposit);
		Elements.click(landingPage.depositRange150to200);
		Elements.TypeText(landingPage.mortgage, "45");
		Elements.click(landingPage.yield);
		Elements.click(landingPage.yield4to6);

	}

	@Then("^I should get a search result$")
	public void i_should_get_a_search_result() throws Throwable {
		
	}


}

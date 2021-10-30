package com.tutorialsninja.automation.stepdef;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;
import com.tutorialsninja.automation.pages.AIvaluationpage;
import com.tutorialsninja.automation.pages.HeaderSection;
import com.tutorialsninja.automation.pages.detailsPage;
import com.tutorialsninja.automation.util.PathHelper;

import cucumber.api.java.en.*;

public class AIvaluation {
	private static Logger log = Logger.getLogger(AIvaluation.class);
	

	HeaderSection headersSection = new HeaderSection();
	AIvaluationpage aivaluationpage = new AIvaluationpage();
	detailsPage detailspage =  new detailsPage();
	
	public static String strUrl;
	
	@Given("^I take a new sales property URL from Zoopla$")
	public void i_take_a_new_sales_property_URL_from_Zoopla() throws Throwable {
	    AIvaluationpage.openRandomZooplaProperty();
		strUrl= Elements.getCurrentUrl();
		
		PropertyConfigurator.configure(PathHelper.getResourcePath("/src/main/resources/ConfigurationFile/log4j.properties"));
		log.info("New url taken from zoopla : "+strUrl);
	}

	@And("^I go to AI valuation page$")
	public void i_go_to_AI_valuation_page() {
	    Base.driver.get(Base.reader.getUrl()+"ai-valuation");
	    
	    log.info("AI valuation page opened");
	}

	@When("^I provide Zoopla link for valuation$")
	public void i_provide_Zoopla_link_for_valuation() throws Exception {
		Elements.TypeText(AIvaluationpage.aiValuationTextBox, strUrl);
		AIvaluationpage.evaluateOnBasisOfReqirement();
		
		log.info("Zoopla link provided for valuation");
	   
	}

	@Then("^I should get AI valuation for the property$")
	public void i_should_get_AI_valuation_for_the_property() {
		Waits.waitUntilElementLocated(10, detailsPage.predictedValue);
	    Assert.assertTrue(Elements.isDisplayed(detailsPage.predictedValue));
	    
	    log.info("Details page loaded");
	}
	
	
	
	}


	


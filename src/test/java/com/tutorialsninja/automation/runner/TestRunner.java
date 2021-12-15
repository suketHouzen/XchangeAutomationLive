package com.tutorialsninja.automation.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"classpath:FeatureFiles/loginPage.feature"},
glue= {"classpath:com.tutorialsninja.automation.stepdef"},
monochrome=true,
plugin= {"html:target/cucumber_html_report","json:target/cucumber-reports/Cucumber.json"},
tags= "@smokeTest"
		)
public class TestRunner {

}

package com.tutorialsninja.automation.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.TableHeader;
import com.tutorialsninja.automation.pages.loginPage;


import io.cucumber.java.en.*;

import org.junit.Assert;

public class login {
    
	loginPage loginpage = new loginPage();
	TableHeader tableheader = new TableHeader();
	@Given("^I login Xchange$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
	   
	   Base.driver.get(Base.reader.getUrl());

		Elements.TypeText(loginPage.getLogInEmail, "demo@houzen.co.uk");
		Elements.TypeText(loginPage.getLoginPassword, "agent123");
		Elements.click(loginPage.getLoginButton);
		
		
	}

	@When("^I search for property$")
	public void enter_the_Username_and_Password() throws Throwable {
	    Thread.sleep(5000);
		Elements.TypeText(TableHeader.getSearchedProperty, "canary wharf");
		
	    Base.driver.findElement(By.xpath("//input[@placeholder='Search by property']")).sendKeys(Keys.ENTER);
		
	}

	@Then("^I should get a search result$")
	
	public void reset_the_credential() throws Throwable {
		
	
		
		String Expected_result ="Canary Wharf, London E14, UK";
		Thread.sleep(5000);
		
		String Actual_result = Base.driver.findElement(By.xpath("//*[@class='rt-tbody']/div[1]/div/div[2]/div/span")).getText();
		System.out.println("Test is successful " + Actual_result);
		
		Assert.assertEquals(Expected_result,Actual_result);
			
}
}

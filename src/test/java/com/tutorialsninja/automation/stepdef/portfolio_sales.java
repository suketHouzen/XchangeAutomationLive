package com.tutorialsninja.automation.stepdef;

import org.openqa.selenium.Keys;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.TableHeader;
import com.tutorialsninja.automation.pages.loginPage;

import cucumber.api.java.en.*;


public class portfolio_sales {


	loginPage loginpage = new loginPage();
	TableHeader tableheader = new TableHeader();
	
	@When("^I click on add property")
	public void click_on_add_property() throws InterruptedException {
		Thread.sleep(7000);
		Elements.click(TableHeader.yourportfolio);
		Thread.sleep(5000);
		Elements.click(TableHeader.portfoliosales);
		Thread.sleep(3000);
		Elements.click(TableHeader.addproperty);
		Elements.click(TableHeader.listingtype);
		Thread.sleep(5000);
		Elements.click(TableHeader.rent);
		Elements.click(TableHeader.noofunits);
		
		Thread.sleep(7000);
		Elements.TypeText(TableHeader.address, "London, UK");
		Thread.sleep(7000);
		TableHeader.address.sendKeys(Keys.DOWN);
		TableHeader.address.sendKeys(Keys.RETURN);
		String winHandleBefore = Base.driver.getWindowHandle();
		for(String winHandle : Base.driver.getWindowHandles()){
			Thread.sleep(7000);
			if(!winHandleBefore.equals(winHandle))
			{
			Base.driver.switchTo().window(winHandle);
			
		
			}
		}Elements.TypeText(TableHeader.postcode, "22020");
		Thread.sleep(5000);
		TableHeader.postcode.sendKeys(Keys.DOWN);
	TableHeader.postcode.sendKeys(Keys.RETURN);
	Thread.sleep(8000);
	Elements.click(TableHeader.savebutton);
		
		
	}
	@Then("^I click on help button$")
	public void click_on_help_button() throws InterruptedException {
		Thread.sleep(8000);
		Elements.click(TableHeader.helpsection);
		
		
	}
}

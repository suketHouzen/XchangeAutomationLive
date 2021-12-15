package com.tutorialsninja.automation.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.TableHeader;
import com.tutorialsninja.automation.pages.loginPage;


import cucumber.api.java.en.*;


import org.junit.Assert;

public class login {
    
	loginPage loginpage = new loginPage();
	TableHeader tableheader = new TableHeader();
	public static String fifthProperty;
	
	@Given("^I login Xchange$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
	   
	   Base.driver.get(Base.reader.getUrl());

		Elements.TypeText(loginPage.getLogInEmail, "demo@houzen.co.uk");
		Elements.TypeText(loginPage.getLoginPassword, "agent123");
		Thread.sleep(5000);
		Elements.click(loginPage.getLoginButton);
		Elements.click(TableHeader.areacodeDropdown);
		Elements.click(TableHeader.clearareaCodes);
		
	}

	@When("^I search for property$")
	public void enter_the_Username_and_Password() throws Throwable {
	    
		
		 fifthProperty = Base.driver.findElement(By.xpath("//*[@class='rt-tbody']/div[5]/div/div[2]/div/span")).getText();
		 Elements.TypeText(TableHeader.getSearchedProperty, fifthProperty);
		    
		    Base.driver.findElement(By.xpath("//input[@placeholder='Search by property']")).sendKeys(Keys.ENTER);
	   
	}

	@Then("^I should get a search result$")
	public void reset_the_credential() throws Throwable {
		
	    	
		Thread.sleep(5000);
		
		String Actual_result = Base.driver.findElement(By.xpath("//*[@class='rt-tbody']/div[1]/div/div[2]/div/span")).getText();
		System.out.println("Test is successful " + Actual_result);
		
		Assert.assertEquals(fifthProperty,Actual_result);
		
	 }
	
	@Then("^I can view details in actions$")
	public void view_details_in_actions() throws InterruptedException {
		
		Elements.click(TableHeader.viewdetails);
		String winHandleBefore = Base.driver.getWindowHandle();
		for(String winHandle : Base.driver.getWindowHandles()){
			Thread.sleep(7000);
			if(!winHandleBefore.equals(winHandle))
			{
			Base.driver.switchTo().window(winHandle);
			//Base.driver.switchTo().window(winHandleBefore);
			
}
		}
	}
	@Then("^I can book a viewing in actions$")
	public void book_a_viewing() throws InterruptedException {
		
		Thread.sleep(5000);
		Elements.click(TableHeader.bookaviewing);
		Thread.sleep(5000);
		Elements.click(TableHeader.cancelbutton);
		
	}
	
	@And("^I can request a property and cancel it$")
	public void refresh_the_page() throws InterruptedException {
		
		
		
		Elements.click(TableHeader.requestproperty);
		Elements.click(TableHeader.requestpropertycancel);
	}
	
	
	}
	/*@Then("^I can share the property details$")
	public void share_the_properties_via_email() throws InterruptedException {
		
		Elements.click(TableHeader.selectproperties);
		Elements.click(TableHeader.sharepropertydetails);
//		Elements.click(TableHeader.copylinkclick);
		Thread.sleep(5000);
		((JavascriptExecutor)Base.driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(Base.driver.getWindowHandles());
	    Base.driver.switchTo().window(tabs.get(1));
	    Base.driver.get("http://google.com");
	    //Actions actions = new Actions(Base.driver);
        //WebElement elementLocator = Base.driver.findElement(By.xpath("//*[@class='gLFyf gsfi']"));
	    //actions.contextClick(elementLocator).perform();
	    
	}*/
		
	
	    
	
	


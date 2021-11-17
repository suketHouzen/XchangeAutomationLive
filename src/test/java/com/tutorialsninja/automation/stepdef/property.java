package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.TableHeader;
import com.tutorialsninja.automation.pages.loginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class property {
		
		loginPage loginpage = new loginPage();
		TableHeader tableheader = new TableHeader();
		public static String Expected_result1;
		
		
	    
		@Then("^I click on price of the property$")
		public void click_on_price_of_the_property() throws InterruptedException {
			Thread.sleep(5000);
		    Expected_result1 = Elements.getText(TableHeader.priceofproperty);
			System.out.println("Expected Property price " + Expected_result1);
			
		}
		@Then("^I should get the same price result in new tab$")
		public void same_price_result_in_new_tab() throws InterruptedException {
			
			Elements.click(TableHeader.priceofproperty);
			String winHandleBefore = Base.driver.getWindowHandle();
			for(String winHandle : Base.driver.getWindowHandles()){
				Thread.sleep(7000);
				if(!winHandleBefore.equals(winHandle))
				{
				Base.driver.switchTo().window(winHandle);
			   
			    Thread.sleep(3000);
			    String Actual_result1 = Elements.getText(TableHeader.getpriceofproperty);
			    
			    System.out.println("Get Property price " + Actual_result1);
			    
			    String Actual_Result1= Actual_result1.replaceFirst("Price £", "");
			    System.out.println("Actual Property price " +Actual_Result1);
			    
			    Assert.assertEquals(Expected_result1, Actual_Result1);
			    //Base.driver.switchTo().window(winHandleBefore);
			   
				}
			}
		}
				
				/*@And("^I can select no of beds with days$")
				public void select_no_of_beds_with_days() throws InterruptedException {
				Thread.sleep(5000);
			    WebElement noOfBeds= Base.driver.findElement(By.xpath("//*[@value='0']"));
			    Select select = new Select(noOfBeds);
			    select.selectByVisibleText("1 Bed");
			    
			    WebElement noOfDays= Base.driver.findElement(By.xpath("//*[@value='1']"));
			    Select select1 = new Select(noOfDays);
			    select1.selectByVisibleText("Last 7 days");
				}  */
			
		    
       }	




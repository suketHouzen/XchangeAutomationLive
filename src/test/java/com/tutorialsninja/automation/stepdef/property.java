package com.tutorialsninja.automation.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.pages.TableHeader;
import com.tutorialsninja.automation.pages.loginPage;

import cucumber.api.java.en.*;


public class property {
		
		loginPage loginpage = new loginPage();
		TableHeader tableheader = new TableHeader();
		public static String Expected_result1;
		public static String Expected_result2;
		
	    
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
		
		        @Then("^I click on commission of the property$")
		        public void click_on_commisson_of_the_property() {
		        	Expected_result2 = Elements.getText(TableHeader.commissionofproperty);
		 			System.out.println("Expected Property commission " + Expected_result2);
		        	
		        }
		        
		        
		        @Then("^I should get the same commission result in new tab$")
				public void same_commission_result_in_new_tab() throws InterruptedException {
					WebElement element;
					Thread.sleep(5000);
					element = TableHeader.commissionofproperty;
					element.click();
					String winHandleBefore = Base.driver.getWindowHandle();
					for(String winHandle : Base.driver.getWindowHandles()){
						Thread.sleep(7000);
						if(!winHandleBefore.equals(winHandle))
						{
						Base.driver.switchTo().window(winHandle);
					   
					    Thread.sleep(3000);
					    String Actual_result2 = Elements.getText(TableHeader.getcommissionofproperty);
					    
					    System.out.println("Get Property commission " + Actual_result2);
					    
					    String Actual_Result2= Actual_result2.replaceFirst("Commission %:", "")+"%";
					    System.out.println("Actual Property commission " +Actual_result2);
					    
					    Assert.assertEquals(Expected_result2, Actual_Result2.trim());
					    //Base.driver.switchTo().window(winHandleBefore);
					   
						}
					}
				}
				
				@And("^I can select no of beds with days$")
				public void select_no_of_beds_with_days() throws InterruptedException {
				
				WebElement AllBeds;
				Thread.sleep(7000);
				AllBeds= Base.driver.findElement(By.xpath("//div[contains(text(),'All Beds')]"));
				AllBeds.click();
				
			    Base.driver.findElement(By.xpath("//*[@data-value='1']")).click();
			    Thread.sleep(2000);
			    WebElement AllTime;
				Thread.sleep(7000);
				AllTime= Base.driver.findElement(By.xpath("//div[contains(text(),'All time')]"));
				AllTime.click();
				
			    Base.driver.findElement(By.xpath("//*[@data-value='2']")).click();
			    
			   
				} 
			
		    
       }	




package com.tutorialsninja.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;
import com.tutorialsninja.automation.framework.Waits;


public class AIvaluationpage {
	public AIvaluationpage() {
		 PageFactory.initElements(Base.driver,this);
	 }
		
		
		@FindBy(xpath="//*[@placeholder='Zoopla/Rightmove url']")
		public static WebElement aiValuationTextBox;
		
		@FindBy(xpath="//*[text()=\"Evaluate\"]")
		public static WebElement evaluateButton;
		
		@FindBy(xpath="//*[@class=\"css-1anhqz4-ListingsContainer earci3d2\"]")
		public static WebElement ZooplaProperty;
		
		//class="css-dob1au-PricingLabel ep4jli10"
		
		@FindBy(xpath="//*[@data-testid=\"price\"]")
		public static WebElement ZooplaPrice;
		
		@FindBy(xpath="//h4[contains(text(),'Please Provide Details of Floor Area')]")
		public static WebElement floorAreaAlertBox;
		
		@FindBy(xpath="//*[@placeholder='Floor Area in sqft']")
		public static WebElement floorAreaTextBox;
		
		@FindBy(xpath="//*[contains(@class, 'btn_outline') and text() = 'Evaluate']")
		public static WebElement floorAreaEvaluate;
		
		@FindBy(xpath="//h4[contains(text(),'Please Provide Details of Floor Level & Floor Area')]")
		public static WebElement floorAreaAndLevelAlertBox;
		
		@FindBy(xpath="//*[@placeholder='Floor Level']")
		public static WebElement floorLevelTextBox;
		
		@FindBy(xpath="//h4[contains(text(),'Please Provide Details of Floor Level')]")
		public static WebElement floorLevelAlertBox;
		
		@FindBy(xpath="//*[text()=\"Accept all cookies\"]")
		public static WebElement acceptAllCookies;
		
		@FindBy(xpath="//*[@id=\"gdpr-consent-manager\"]")
		public static WebElement frame;
		
		
		
		
		public static void openRandomZooplaProperty() throws Exception {
			Base.driver.get("https://www.zoopla.co.uk/for-sale/property/nw3/?page_size=25&view_type=list&q=NW3&radius=40&results_sort=newest_listings&search_source=refine");
			/*Thread.sleep(10000);
			////*[@id="gdpr-consent-manager"]
			JavascriptExecutor executor = (JavascriptExecutor)Base.driver;
			executor.executeScript("arguments[0].click();", acceptAllCookies);
			
		   /* Base.driver.switchTo().defaultContent();
			Base.driver.switchTo().frame(frame);
			AIvaluationpage.acceptAllCookies.click();
			new WebDriverWait(Base.driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("html/body/div[1]/iframe")));*/
			/*Thread.sleep(10000)
			int size = Base.driver.findElements(By.tagName("iframe")).size();

			for(int i=0; i<=size; i++){
				Base.driver.switchTo().frame(i);
				int total=Base.driver.findElements(By.xpath("//*[text()=\"Accept all cookies\"]")).size();
				System.out.println(total);
				    Base.driver.switchTo().defaultContent();}*/
			Base.driver.switchTo().defaultContent();
			Base.driver.switchTo().frame(2);
			AIvaluationpage.acceptAllCookies.click();
			Base.driver.switchTo().defaultContent();
		    Elements.click(AIvaluationpage.ZooplaProperty);
		    Waits.waitUntilElementLocated(10, AIvaluationpage.ZooplaPrice);
		}
		
		public static void evaluateOnBasisOfReqirement() throws Exception{
			
			Elements.click(AIvaluationpage.evaluateButton);
		    Thread.sleep(20000);
		    if(Elements.isDisplayed(AIvaluationpage.floorAreaAndLevelAlertBox)) {
				Elements.TypeText(AIvaluationpage.floorAreaTextBox, "2341");
				Elements.TypeText(AIvaluationpage.floorLevelTextBox, "4");
			    Elements.click(AIvaluationpage.floorAreaEvaluate);
	    	System.out.println("floor level and floor area");}

			    
		    else if(Elements.isDisplayed(AIvaluationpage.floorAreaAlertBox)) {
		    	
		    	System.out.println("floor area");
				Elements.TypeText(AIvaluationpage.floorAreaTextBox, "1245");
			    Elements.click(AIvaluationpage.floorAreaEvaluate);}
		    
		    else if(Elements.isDisplayed(AIvaluationpage.floorLevelAlertBox)) {
		    	System.out.println("floor level");

				Elements.TypeText(AIvaluationpage.floorLevelTextBox, "3");
			    Elements.click(AIvaluationpage.floorAreaEvaluate);}
		}		
		}
		


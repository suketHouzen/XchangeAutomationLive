package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class PropertydetailsPage {
	public PropertydetailsPage() {
		 PageFactory.initElements(Base.driver,this);
	 }
		@FindBy(xpath="//*[@class=\"predicted_value\"]")
		public static WebElement predictedValue;
}

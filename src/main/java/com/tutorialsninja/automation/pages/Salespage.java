package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;
import com.tutorialsninja.automation.framework.Elements;


public class Salespage {
	public Salespage() {
		 PageFactory.initElements(Base.driver,this);
	 }
		
		
		@FindBy(xpath="//*[contains(@class, 'MuiButtonBase-root MuiTab-root jss1099 MuiTab-textColorInherit')]")
		public static WebElement salesTextBox;
		
		@FindBy(xpath="//*[[contains(@class, 'MuiButtonBase-root MuiTab-root jss1099 MuiTab-textColorInherit Mui-selected jss1109')]")
		public static WebElement lettingsTextBox;
		
		public static void evaluateZooplaLink() {
			Elements.TypeText(Salespage.salesTextBox, "https://www.zoopla.co.uk/for-sale/details/59357225/?featured=1&utm_content=featured_listing");
		    Elements.click(Salespage.lettingsTextBox);
		}
		
		}
		


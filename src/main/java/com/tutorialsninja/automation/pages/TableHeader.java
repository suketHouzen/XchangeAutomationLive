package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class TableHeader {
 public TableHeader() {

		PageFactory.initElements(Base.driver, this);
	}
	
	   @FindBy(xpath="//input[@placeholder='Search by property']")
	   public static WebElement getSearchedProperty;
	   
}

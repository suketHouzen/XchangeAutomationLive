package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class landingPage {
	public landingPage() {
		 PageFactory.initElements(Base.driver,this);
	 } 
	
	@FindBy(xpath="//*[@id=\"free-solo-2-demo\"]")
	public static WebElement searchLocation;
	
	@FindBy(xpath="//*[@id=\"exampleFormControlSelect1\" and @name=\"budget\"]")
	public static WebElement deposit;
	
	@FindBy(xpath="//*[@id=\"exampleFormControlSelect1\"]/option[5]")
	public static WebElement depositRange150to200;
	
	@FindBy(xpath="//*[@id=\"exampleFormControlInput1\"]")
	public static WebElement mortgage;
	
	@FindBy(xpath="//*[@id=\"exampleFormControlSelect1\" and @name=\"yield\"]")
	public static WebElement yield;
	
	@FindBy(xpath="//*[@id=\"exampleFormControlSelect1\"]/option[3]")
	public static WebElement yield4to6;
	
}

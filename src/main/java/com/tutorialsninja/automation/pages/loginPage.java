package com.tutorialsninja.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tutorialsninja.automation.base.Base;

public class loginPage {
	
	public loginPage() {
		
		PageFactory.initElements(Base.driver, this);
	}
	
	   @FindBy(xpath="//*[@id=\"email\"]")
	   public static WebElement getLogInEmail;
		

		@FindBy(xpath="//*[@id=\"password\"]")
        public static WebElement getLoginPassword;
		
		@FindBy(xpath="//*[text()=\"Log In\"]//parent::button")
	    public static WebElement getLoginButton;

}

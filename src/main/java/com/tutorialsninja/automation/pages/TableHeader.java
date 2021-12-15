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
	   
	   @FindBy(xpath="//*[@title='Open']")
	   public static WebElement areacodeDropdown;
	   
	   @FindBy(xpath="//*[@title='Clear']")
	   public static WebElement clearareaCodes;
	   
	   @FindBy(xpath="//*[@type='checkbox']")
	   public static WebElement selectproperties;
	   
	   @FindBy(xpath="//*[@src='/static/media/Share_icon.3c92717a.png']")
	   public static WebElement sharepropertydetails;
	   
	   @FindBy(xpath="//*[@name='copylink']")
	   public static WebElement copylinkclick;
	   
	   @FindBy(xpath="//div[@class='rt-tbody']//div[1]//div[1]//div[6]")
	   public static WebElement priceofproperty;
	   
	   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div[1]/p")
	   public static WebElement getpriceofproperty;
	   
	   @FindBy(xpath="//div[@class='rt-tbody']//div[1]//div[1]//div[7]")
	   public static WebElement commissionofproperty;
	   
	   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[1]/div/div[1]/div[2]/div[2]/p")
	   public static WebElement getcommissionofproperty;
	   
	   @FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div[3]/div/div/div[2]/div[3]/div[1]/div[2]/div[1]/div/div[10]/div/img")
	   public static WebElement viewdetails;
	   
	   @FindBy(xpath="//div[@class='rt-tbody']//div[1]//div[1]//div[10]//div[1]//*[name()='svg']")
	   public static WebElement bookaviewing;
	   
	   @FindBy(xpath="//span[normalize-space()='Cancel']")
	   public static WebElement cancelbutton;
	   
	   @FindBy(xpath="//span[normalize-space()='Request Property']")
	   public static WebElement requestproperty;
	   
	   @FindBy(xpath="//span[normalize-space()='Cancel']")
	   public static WebElement requestpropertycancel;
	   
	   @FindBy(xpath="//span[normalize-space()='Lettings']")
	   public static WebElement instructionlettings;
	   
	   @FindBy(xpath="//*[text()='offer']")
	   public static WebElement offersbutton;
	   
	   @FindBy(xpath="//*[@placeholder='Search previous applicant']")
	   public static WebElement searchpreviousapplicant;
	   
	   @FindBy(xpath="//div[@role='menuitem']")
	   public static WebElement applicantname;
	   
	   @FindBy(xpath="(//span[@class='MuiButton-label'][normalize-space()='Next'])[3]")
	   public static WebElement nextbutton;
			
	   @FindBy(xpath="//*[@placeholder='No. of Parking Spaces']")
	   public static WebElement noofparkingspaces;
	   
	   @FindBy(xpath="//*[@placeholder='No. of Pets']")
	   public static WebElement noofpets;
	   
	   @FindBy(xpath="//*[@placeholder='Offered Price/Rent']")
	   public static WebElement offeredprice;
	   
	   @FindBy(xpath="//*[@placeholder='Unit Number']")
	   public static WebElement unitnumber;
	   
	   @FindBy(xpath="//*[@placeholder='Tenancy Length']")
	   public static WebElement tenancylength;
	   
	   @FindBy(xpath="//*[@placeholder='Specific Requirements']")
	   public static WebElement specificrequirements;
	   
	   @FindBy(xpath="(//div[contains(@class,'MuiListItemText-multiline')][normalize-space()='Your Portfolio'])[1]")
	   public static WebElement yourportfolio;
	   
	   @FindBy(xpath="//*[@id=\"root\"]/div/div[1]/div[2]/div/div/div[1]/ul/li[2]/div[2]/div/div/ul/li[1]/div/a")
	   public static WebElement portfoliosales;
	   
	   @FindBy(xpath="//span[normalize-space()='+ Add Property']")
	   public static WebElement addproperty;
	   
	   @FindBy(xpath="//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']")
	   public static WebElement listingtype;
	   
	   @FindBy(xpath="//li[normalize-space()='Rent']")
	   public static WebElement rent;
	   
	   @FindBy(xpath="//*[name()='path' and contains(@d,'M19 13h-6v')]")
	   public static WebElement noofunits;
	   
	   @FindBy(xpath="//*[@placeholder='Address']")
	   public static WebElement address;
	   
	   @FindBy(xpath="//*[@placeholder='Post code']")
	   public static WebElement postcode;
	   
	   @FindBy(xpath="//*[text()='Save']")
	   public static WebElement savebutton;
	   
	   @FindBy(xpath="//*[@xpath='1']")
	   public static WebElement helpsection;
	   
	   
	   
}

/**
 * 
 */
package com.colombia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.colombia.utilities.ReadProperties;

/**
 * @author irfan
 *
 */


public class EaglePortalLoginPage{
	WebDriver driver;
	ReadProperties properties = new ReadProperties();

	//Constructor
	public EaglePortalLoginPage(WebDriver driver){
		/*this.driver=driver;
		PageFactory.initElements(driver, EaglePortalLoginPage.class);*/
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Using FindBy for locating elements
	//@FindBy(xpath = "//input[@id='textfield-1026-inputEl']") private WebElement eagleUserNameField;	
	//@FindBy(xpath = "//input[@type='text' and @name='username']") private WebElement eagleUserNameField;
	@FindBy(xpath = "//input[@name='username']") private WebElement eagleUserNameField;
	 
	//@FindBy(xpath = "//input[@id='textfield-1027-inputEl']") private WebElement eaglePasswordField;
	//@FindBy(xpath = "//input[@type='password' and @name='password']") private WebElement eaglePasswordField;
	@FindBy(xpath = "//input[@name='password']") private WebElement eaglePasswordField;	
	@FindBy(xpath = "//span[@id='button-1032-btnEl']") private WebElement loginButton;
	//@FindBy(xpath = "//span[text()='Login']") private WebElement loginButton;


	//Method to login Eagle Portal
	public void loginEaglePortal(String userName, String password){
		eagleUserNameField.clear();
		eagleUserNameField.click();
		eagleUserNameField.sendKeys(userName);
		eaglePasswordField.clear();
		eaglePasswordField.click();
		eaglePasswordField.sendKeys(password);
		loginButton.click();		
	}


	public String verifyLoginPageTitle() {
		return driver.getTitle();
	}


}
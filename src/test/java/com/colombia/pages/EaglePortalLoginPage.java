/**
 * 
 */
package com.colombia.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.servlet.jmx.HolderMBean;
import org.testng.Assert;

/**
 * @author irfan
 *
 */


public class EaglePortalLoginPage{
	WebDriver driver;

	//Constructor
	public EaglePortalLoginPage(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, HomePage.class);
	}
	
	//Using FindBy for locating elements
	//@FindBy(linkText = "Sign in") WebElement signInLink;	
	@FindBy(xpath = "//input[@id='textfield-1025-inputEl']") WebElement eagleUserNameField;	
	@FindBy(xpath = "//input[@id='textfield-1026-inputEl']") WebElement passwordField;
	@FindBy(xpath = "//span[@id='button-1031-btnEl']") WebElement loginButton;
	
	
	//h2[contains(text(),'Login to your account')]
	
	public String verifyHomePageTitle(){
		System.out.println("Title is  " + driver.getTitle());
		//Assert.assertEquals(actual, expected);
		return driver.getTitle();
	}
	
}
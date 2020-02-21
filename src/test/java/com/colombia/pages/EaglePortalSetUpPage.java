/**
 * 
 */
package com.colombia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.colombia.common.CommonActions;
import com.colombia.utilities.ReadProperties;

/**
 * @author irfan
 *
 */
public class EaglePortalSetUpPage {
	WebDriver driver;
	ReadProperties properties = new ReadProperties();

	//Constructor
	public EaglePortalSetUpPage(WebDriver driver){
		/*this.driver=driver;
			PageFactory.initElements(driver, EaglePortalLandingPage.class);*/
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//Using FindBy for locating elements
	@FindBy(xpath = "//span[@class='fas fa-wrench']") private WebElement setUpElement;	
	// Setup page with buddi logo 
	@FindBy(xpath = "//img[starts-with(@id, 'image')]") private WebElement buddiLogoElement;	
	// Log out element
	@FindBy(xpath = "//span[text()='Log Out']") private WebElement logOutElement;


	//Method to click SetUp in landing page
	public void clickSetUp(){
		CommonActions.waitForElementToBeClickable(driver, setUpElement);
		setUpElement.click();		
	}

	// To verify buddi logo
	public boolean verifybuddiLogo(){
		return buddiLogoElement.isDisplayed();
	}
	
	public String verifySetUpPageTitle() {
		return driver.getTitle();
	}

	//Method to click SetUp in landing page
	public void logoutEaglePortal(){
		CommonActions.waitForElementToBeClickable(driver, logOutElement);
		logOutElement.click();		
	}
}

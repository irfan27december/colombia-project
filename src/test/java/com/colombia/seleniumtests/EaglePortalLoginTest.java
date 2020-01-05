/**
 * 
 */
package com.colombia.seleniumtests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.colombia.utilities.ReadProperties;

/**
 * @author irfan
 *
 */
public class EaglePortalLoginTest extends BaseTest{
	ReadProperties properties = new ReadProperties();
	//EaglePortalLoginPage eaglePortalLoginPage = new EaglePortalLoginPage(driver);
	
	@Test
	public void accessEagleLoginInPage() throws InterruptedException{
		//EaglePortalLoginPage eaglePortalLoginPage = PageFactory.initElements(driver, EaglePortalLoginPage.class);	
		String actualTitle = eaglePortalLoginPage.verifyLoginPageTitle();
		Assert.assertEquals(actualTitle, "Buddi");
		
		eaglePortalLoginPage.loginEaglePortal(properties.getPropertyValue("eagleUserName"), properties.getPropertyValue("eagleUserpassword"));
		Thread.sleep(5000);
	}

}

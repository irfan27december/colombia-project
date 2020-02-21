/**
 * 
 */
package com.colombia.seleniumtests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.colombia.utilities.ReadProperties;
import com.colombia.utilities.StringConstants;

/**
 * @author irfan
 *
 */
public class EaglePortalLoginTest extends BaseTest{
	ReadProperties properties = new ReadProperties();
	//EaglePortalLoginPage eaglePortalLoginPage = new EaglePortalLoginPage(driver);
	
	@Test(priority=0)
	public void accessEagleLoginInPage() throws InterruptedException{
		//EaglePortalLoginPage eaglePortalLoginPage = PageFactory.initElements(driver, EaglePortalLoginPage.class);	
		String actualTitle = eaglePortalLoginPage.verifyLoginPageTitle();
		Assert.assertEquals(actualTitle, StringConstants.EAGLE_PAGE_TITLE);
		
		eaglePortalLoginPage.loginEaglePortal(properties.getPropertyValue("eagleUserName"), properties.getPropertyValue("eagleUserpassword"));
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	public void eagleFailedTest() throws InterruptedException{		
		Assert.assertEquals("Buddi", "BuddiFail");
	}

}

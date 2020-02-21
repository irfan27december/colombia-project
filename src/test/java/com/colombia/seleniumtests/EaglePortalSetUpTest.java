/**
 * 
 */
package com.colombia.seleniumtests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.colombia.pages.EaglePortalSetUpPage;
import com.colombia.utilities.ReadProperties;
import com.colombia.utilities.StringConstants;

/**
 * @author irfan
 *
 */
public class EaglePortalSetUpTest extends BaseTest{
	
	ReadProperties properties = new ReadProperties();
	@Test(priority=0)
	public void openSetUpPage() throws InterruptedException{
		//EaglePortalSetUpPage eaglePortalSetUpPage = PageFactory.initElements(driver, EaglePortalSetUpPage.class);	
		eaglePortalSetUpPage.clickSetUp();
		boolean isBuddiLogoPresent = true;
		Assert.assertEquals(isBuddiLogoPresent, eaglePortalSetUpPage.verifybuddiLogo());
		Thread.sleep(5000);
		String actualTitle = eaglePortalSetUpPage.verifySetUpPageTitle();
		Assert.assertEquals(actualTitle, StringConstants.SETUP_PAGE_TITLE);
		eaglePortalSetUpPage.logoutEaglePortal();
		
	}

}

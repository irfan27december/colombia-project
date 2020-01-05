/**
 * 
 */
package com.colombia.seleniumtests;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.colombia.pages.EaglePortalLoginPage;

/**
 * @author irfan
 *
 */
public class EaglePortalLoginTest extends BaseTest{
	
	@Test
	public void accessEagleLoginInPage() throws InterruptedException{
		EaglePortalLoginPage eaglePortalLoginPage = PageFactory.initElements(driver, EaglePortalLoginPage.class);
		//homePage.clickSignInLink();
		
		Assert.assertEquals(eaglePortalLoginPage.verifyHomePageTitle(), "Buddi");
		Thread.sleep(5000);
	}

}

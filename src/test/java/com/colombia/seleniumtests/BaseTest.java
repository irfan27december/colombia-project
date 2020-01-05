package com.colombia.seleniumtests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.colombia.pages.EaglePortalLoginPage;
import com.colombia.utilities.ReadProperties;



/**
 * @author irfan
 *
 */


public class BaseTest {
	public static WebDriver driver = null;
	ReadProperties properties = new ReadProperties();
	protected EaglePortalLoginPage eaglePortalLoginPage;
	public static final String testDataExcelFileName = "testdata.xlsx";
	/**
	 * @author irfan
	 * Method to setup browser
	 */
	@Parameters({"brower", "driverPath"})
	@BeforeSuite
	public void setUp(@Optional("chrome") String browser, @Optional("drivers/chromedriver.exe") String driverPath){
		if(browser.equalsIgnoreCase(browser)){
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.get(properties.getPropertyValue("eaglePortalURL"));
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		}else{

		}

	}

	
	@BeforeClass
	public void initialize() {
		eaglePortalLoginPage = new EaglePortalLoginPage(driver);
		
	}
	
	//Method to close browser
	@AfterSuite
	public void tearDown(){
		driver.close();
		driver.quit();
	}


}
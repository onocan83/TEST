package com.demoblaze.qa.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demoblaze.pageobject.DB_RegisterPage_PO_Initilize;
import com.demoblaze.testbases.TestBases;





public class DemoBlazeRegistration extends TestBases {
	public WebDriver driver;
    public DB_RegisterPage_PO_Initilize dbregisterpage;
  
	public DemoBlazeRegistration() {
	super();
	}
	
	
	@BeforeMethod
	public void initialSetup() throws Exception {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
		Thread.sleep(7000);
	}

		@Test(priority = 1)
		public void registrationPage() {
			DB_RegisterPage_PO_Initilize dbregisterpage = new DB_RegisterPage_PO_Initilize(driver);
			dbregisterpage.clickOnSignInButton();
			dbregisterpage.userNameField();
			dbregisterpage.passwordField();
			dbregisterpage.registerButton();
		}		
			
			
			
		@AfterMethod
		public void tearDown() {
		driver.quit();
				
		
		}
		}


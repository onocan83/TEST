package com.demoblaze.qa.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoblaze.pageobject.DB_HomePage_PO_Initilize;
import com.demoblaze.testbases.TestBases;



public class DemoBlazeHomePage extends TestBases {
	public WebDriver driver;
	public SoftAssert softassert = new SoftAssert();
	public DB_HomePage_PO_Initilize dbhomepage;
	
	public DemoBlazeHomePage() {
	super();
	}
	
	@BeforeMethod
	public void initialSetup() throws Exception  {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
		Thread.sleep(7000);

	}
	@Test
	public void insepctingAndVerifyingSomeElementsonHomePage() {
		DB_HomePage_PO_Initilize dbhomepage = new DB_HomePage_PO_Initilize(driver);
		String aboutussentence = dbhomepage.checkAboutUsOnHomePage();
		String aboutusverification = "About Us";
		softassert.assertEquals(aboutussentence,aboutusverification);
	    softassert.assertAll();
		
	    String getintouch = dbhomepage.checkGetInTouchOnHomePage();
	    String getintouchverification = "Get in Touch";
	    softassert.assertEquals(getintouch ,getintouchverification);
	    softassert.assertAll();
	    
	    

}
}

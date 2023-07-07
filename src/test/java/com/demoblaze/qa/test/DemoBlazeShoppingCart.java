package com.demoblaze.qa.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demoblaze.pageobject.DB_ShoppingCart_PO_Initilize;
import com.demoblaze.testbases.TestBases;





public class DemoBlazeShoppingCart extends TestBases{

	public WebDriver driver;
	public ChromeOptions options;
	public SoftAssert softassert = new SoftAssert();
	public DB_ShoppingCart_PO_Initilize dpshoppingcart;
	
	
	public DemoBlazeShoppingCart() {
		super();
	}
	
	
	
	@BeforeMethod
	public void initialSetup() throws Exception {
		options = new ChromeOptions();
		options.addArguments("--headless");
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
		Thread.sleep(7000);
		
	
		
	}

	@Test 
	public void checkOutButtonWithProduct() throws Exception {
		DB_ShoppingCart_PO_Initilize dpshoppingcart = new DB_ShoppingCart_PO_Initilize(driver);
		dpshoppingcart.clickOnPhonesButton();
		dpshoppingcart.chooseSamsungGalaxy();
		dpshoppingcart.clickAddToCartButton();
	
		try {
	        Alert alert = driver.switchTo().alert();
	        String alertText = alert.getText();
	        System.out.println("Alert text: " + alertText);
	        alert.accept();
	    } catch (Exception e) {
	        
	        System.out.println("No alert found: " + e.getMessage());
	        
	    }
	    dpshoppingcart.checkTheCart();
		String verificationsentence = dpshoppingcart.verifyToSeeProductIsInTheCart();
		String actualsentence = "Samsung galaxy s6";
		softassert.assertEquals(verificationsentence,actualsentence);
	    softassert.assertAll();
	
	}    
	
	
	   @AfterMethod
	   public void tearDown() {
	   driver.quit();
	    
	   }

	}
	


	
	
	
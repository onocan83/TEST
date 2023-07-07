package com.demoblaze.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DB_ShoppingCart_PO_Initilize {
	public WebDriver driver;
	
	
	@FindBy(xpath = ("//div[@id='contcont']//a[2]"))
	private WebElement clickonphones;

	@FindBy(xpath = ("//a[normalize-space()='Samsung galaxy s6']"))
	private WebElement samsunggalaxys6;
	
	@FindBy(xpath = ("//a[@onclick = 'addToCart(1)']"))
	private WebElement addToCart;
	
	
	@FindBy(id  = ("cartur"))
	private WebElement navigatetocart;
	
	@FindBy (xpath = ("//td[contains(text(),'Samsung galaxy s6')]"))
	private WebElement verificationsentence;
			
			
	public DB_ShoppingCart_PO_Initilize (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void clickOnPhonesButton() {
		clickonphones.click();
	}

	public void chooseSamsungGalaxy() {
		samsunggalaxys6.click();
		
	}

	public void clickAddToCartButton() {
		addToCart.click();
		
	}

	public void checkTheCart() {
		navigatetocart.click();
	}

	public String verifyToSeeProductIsInTheCart() {
		String actualsentence = verificationsentence.getText();
		return actualsentence;
}
}





package com.demoblaze.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DB_RegisterPage_PO_Initilize {
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//a[@id = 'signin2']")
	private WebElement signinbutton;

	@FindBy(css = "input#sign-username")
	private WebElement usernamefield;
	
	@FindBy(css = "input#sign-password")
	private WebElement passwordfield;
	
	@FindBy(xpath = "//button[@onclick = 'register()']")
	private WebElement registerbutton;
	
	

	public DB_RegisterPage_PO_Initilize(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public void clickOnSignInButton() {
		signinbutton.click();
	}

	public void userNameField() {
		usernamefield.sendKeys("cnonur@hotmail.com");
		
	}

	public void passwordField() {
		passwordfield.sendKeys("Onur123@");
		
	}

	public void registerButton() {
		registerbutton.click();
		
		
	}
}



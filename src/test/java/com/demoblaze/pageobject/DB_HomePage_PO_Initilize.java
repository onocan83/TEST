package com.demoblaze.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DB_HomePage_PO_Initilize {
public WebDriver driver;
	
	
	@FindBy(xpath = "//b[normalize-space()='About Us']")
	private WebElement checkingaboutussentence;

	@FindBy(css = "div.col-sm-3>div>div>h4")
	private WebElement checkinggetintouchsentence;
	
	
	

	public DB_HomePage_PO_Initilize(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	public String checkAboutUsOnHomePage() {
		String aboutusverification = checkingaboutussentence.getText();
		return aboutusverification;
	}

	public String checkGetInTouchOnHomePage() {
		String getintouchverification = checkinggetintouchsentence.getText();
		return getintouchverification;
	}
}
	


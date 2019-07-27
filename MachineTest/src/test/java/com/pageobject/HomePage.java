package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//Always declare public if 
	public WebDriver driver;
	
	//driver is assign to 
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="wzrk-cancel")
	private WebElement getCancleButton;
	
	@FindBy(id="source")
	private WebElement from;
	
	@FindBy(xpath="//*[contains(text(),'Kolkata,Kolkata - India')]")
	private WebElement selectSource;
	
	//Auto suggest text for this i missed the selection
	@FindBy(xpath="//*[contains(text(),'Delhi,Delhi - India')]")
	private WebElement selectDest;
	
	@FindBy(id="destination")
	private WebElement dest;
	
	@FindBy(id="departure")
	private WebElement setDeparture;
	
	@FindBy(id="search-flight-btn")
	private WebElement searchButton;
	
	public WebElement getGetCancleButton() {
		return getCancleButton;
	}
		
	
	public WebElement getSelectSource() {
		return selectSource;
	}

	public WebElement getSelectDest() {
		return selectDest;
	}

	
	
	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSetDeparture() {
		return setDeparture;
	}

	public WebElement getFrom() {
		return from;
	}

	public WebElement getDest() {
		return dest;
	}

}

	


	
	
	
	
	



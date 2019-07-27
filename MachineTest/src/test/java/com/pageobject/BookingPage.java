package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage {
	WebDriver driver;
	
	public BookingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	} 
	
	//Mouse Move to Stop
	 @FindBy(className="stopText js-stopsText allText")
	 private WebElement dropIcon;
	//Validate stop-0 is checked or not
	 
	
	@FindBy(id="0_stops")
	 private WebElement zeroStop;


	@FindBy(id="1_stops")
	 private WebElement oneStop;

	
	 @FindBy(id="2_stops")
	 private WebElement secondStop;
	 
	 @FindBy(id="3_stops")
	 private WebElement thirdStop;
	

	 
	 @FindBy(xpath="//div[@class='oneway']/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/span/span[@class='price']")
	 private WebElement price;
	 
	
	 @FindBy(xpath="//div[@class='oneway']/div[3]/div[1]/div[3]/div[2]/button[@class='bookCTA u_marB5']")
	 private WebElement bookButton;
	 
	 
	 public WebElement getPrice() {
		return price;
	}


	public WebElement getBookButton() {
		return bookButton;
	}


	public WebElement getDropIcon() {
			return dropIcon;
	}

	
	 public WebElement getZeroStop() {
		return zeroStop;
	}
	 
	 public WebElement getSecondStop() {
		return secondStop;
	}


	public WebElement getOneStop() {
		return oneStop;
	}


	public WebElement getThirdStop() {
		return thirdStop;
	}

	
	
	
	
	
	

	

}

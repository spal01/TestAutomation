

package com.mc;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.pageobject.BookingPage;
import com.pageobject.HomePage;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestFilghtBokking {
	//Declare driver
	public WebDriver driver;
	
	//Declare homepage for 
	HomePage homePage; 
	BookingPage bookingPage;
	
	
	String baseUrl="https://in.via.com/";
	String src="Blr";
	String dest="Kol";
	 
	 Actions actions;
	 WebElement wb;
	 
	
	 Calendar cal;
	
	 ExtentReports eReports;	
	 ExtentTest logger;

	
	 
	
	@BeforeMethod
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver","E:\\javaWorkspace\\MachineTest\\driver\\chromedriver.exe" );
		driver = new ChromeDriver();
		actions=new Actions(driver);
		
		//Injecting the driver to the each page
		homePage=new HomePage(driver);
		bookingPage=new BookingPage(driver);
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		}
  @Test
  public void openBrowser() throws InterruptedException {
	  
	 //Launch URL
	  driver.get(baseUrl);
	  homePage.getGetCancleButton().click();
	  
	//Select source
	  homePage.getFrom().sendKeys(src);
	  Thread.sleep(2000);
	  wb=homePage.getSelectSource();
	  actions.moveToElement(wb).build().perform();
	  wb.click();
	  
	  //Select destination
	  homePage.getDest().sendKeys(dest);
	  Thread.sleep(2000);
	  wb=homePage.getSelectDest();
	  actions.moveToElement(wb).build().perform();
	  wb.click();
	  
	  
	
	  
	  //================Calculate the departure date that is 20 day forward from current date===============
	  Calendar cal=Calendar.getInstance();
	  cal.add(Calendar.DAY_OF_MONTH, 20);
	  
	 //Extracting date and monthh
	 String date=String.valueOf(cal.get(Calendar.DATE));
	 String month=String.valueOf(cal.get(Calendar.MONTH));
	  

	 //Select departure date
	  wb=driver.findElement(By.xpath("//div[@data-month="+month+"]/div[2]/div[4]/div[@data-date='"+date+"']"));
	  actions.moveToElement(wb).build().perform();
	  wb.click();
	  //Hit on search button
	  homePage.getSearchButton().click();	
	  Thread.sleep(80000);
	  
	  //========================Booking the flight==================
	 
	  //Verify the Booking Page has come
	  
	  /*wb=bookingPage.getDropIcon();
	  actions.moveToElement(wb).build().perform();
	  wb.click();
	  
	  wb=bookingPage.getZeroStop();
	  if(!wb.isSelected()){
		  wb.click();
	  }
	  
	  wb=bookingPage.getOneStop();
	  if(wb.isSelected()){
		  wb.click();
	  }
	   
	  wb=bookingPage.getSecondStop();
	  if(wb.isSelected()){
		  wb.click();
	  }
	  
	  wb=bookingPage.getThirdStop();
	  if(wb.isSelected()){
		  wb.click();
	  }
	  */
	  Thread.sleep(2000);
	  
	 String price=bookingPage.getPrice().getText();
	 System.out.println(price);
	 
	 bookingPage.getBookButton().click();

	 
	  
	  
	  
  }
  
 
  
  @AfterMethod
  public void tearDown(){
	  //driver.quit();
	  
  }
  
  
  
  
}

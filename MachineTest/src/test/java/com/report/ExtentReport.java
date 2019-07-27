package com.report;

	import java.io.File;

	import org.testng.Assert;
	import org.testng.ITestResult;
	import org.testng.SkipException;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;
	import org.testng.internal.TestResult;

	import com.relevantcodes.extentreports.ExtentReports;
	import com.relevantcodes.extentreports.ExtentTest;
	import com.relevantcodes.extentreports.LogStatus;

	public class ExtentReport {
	  
	ExtentReports eReports;	
	ExtentTest logger;

	@BeforeTest
	  public void beforeTest() {
		eReports=new ExtentReports("E://javaWorkspace//MachineTest//test-output//STExtentReport.html",true);
		eReports.addSystemInfo("Host Name","Software Testing Material");
		eReports.loadConfig(new File("E://javaWorkspace//MachineTest//extent-config.xml"));
	  }

	@Test
	public void passTest1() {
		logger=eReports.startTest("PassTest1");
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Test Case is passed");
	}

	@Test
	public void passTest2() {
		logger=eReports.startTest("PassTest2");
		Assert.assertTrue(false);
		logger.log(LogStatus.PASS, "Test Case is passed");
	}
	@Test
	public void passTest3() {
		logger=eReports.startTest("PassTest3");
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Test Case is passed");
	}


	@Test
	public void failTest1() {
		logger=eReports.startTest("failTest1");
		Assert.assertTrue(false);
		logger.log(LogStatus.FAIL, "Test Case is Faled");
		
	}

	@Test
	public void failTest2() {
		logger=eReports.startTest("failTest2");
		Assert.assertEquals(10, 20);
		logger.log(LogStatus.FAIL, "Test Case is Faled");
		
	}





	@Test
	public void skipTest() {
		logger=eReports.startTest("Skip Test");
		throw new SkipException("Skipping -This is not ready for testing");
	}

	@AfterMethod
	public void getResult(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getName());
			logger.log(LogStatus.FAIL, "Test Case Failed is " + result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SKIP){
			logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		}
		eReports.endTest(logger);
	}
	@AfterTest
	public void endReport(){
		eReports.flush();
		eReports.close();
	}



	}

	
	


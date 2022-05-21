package extentreport;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import testclasses.BaseTest;
import utility.screenshotMethodForProject;

public class ListenerClass1 extends BaseTest implements ITestListener {
   public static ExtentTest test;
   ExtentReports extent=ExtentReportGen.extentReportGenerator();
  
	
	public void onTestStart(ITestResult result) {
	System.out.println("test case started"+result.getName());
	test=extent.createTest(result.getName());
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("test case passed"+result.getName());
		test.log(Status.PASS, "Test case is passed");
		
	}

	
	public void onTestFailure(ITestResult result) {
	System.out.println("test case failed"+result.getName());
	test.fail(result.getThrowable());
	
	
	try {
	test.addScreenCaptureFromPath(screenshotMethodForProject.m1(driver,result.getName()), "captured scrrenshot");
	}
	catch(IOException e)
	{
		System.out.println("exception occured while taking screenshot");
	}
	}

	
	public void onTestSkipped(ITestResult result) {
	System.out.println("test case got skipped"+result.getName());
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	
	public void onStart(ITestContext context) {
	System.out.println("test started"+context.getName());
	
	}

	
	public void onFinish(ITestContext context) {
		System.out.println("test completed"+context.getName());
		extent.flush();
	}


	

}

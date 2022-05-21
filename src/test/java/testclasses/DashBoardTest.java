package testclasses;

import org.testng.annotations.Test;

import extentreport.ListenerClass1;

public class DashBoardTest extends ListenerClass1 {

	@Test(priority = 3)
	public void searchValidation()
	{
		
		db.clickOnGetStarted();
		test.info("Clicked on get started button");
		db.searchshears();
		test.info("searched the shears");
	}
	
	@Test(priority = 4)
	public void buyshearvalidation()
	{
		
		db.buyshears();
		test.info("shear has been buy");
	}
}

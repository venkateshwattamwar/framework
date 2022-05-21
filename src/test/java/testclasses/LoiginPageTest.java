package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import extentreport.ListenerClass1;

public class LoiginPageTest extends ListenerClass1 {

	@Test(priority = 1)
	public void verifyLogin()
	{
		lp.enterCredentials();
		test.info("Credentials has been entered");
		lp.clickOnLogin();
		test.info("Clicked on Login button");
		lp.enterPin();
		test.info("Pin has been entered");
	}
	
	@Test(priority = 2)
	public void titleValidation()
	{
		String actualtitle =lp.getTitleOfPage();
		test.info("Title of the page has been fetched");
		
		Assert.assertEquals(actualtitle,"Dashboard / Kite");
	}
	
}

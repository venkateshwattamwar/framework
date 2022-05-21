package testclasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashBoard;
import pages.Loginpage;

public class BaseTest  {

	
	public static WebDriver driver;
	public Loginpage lp;
	public DashBoard db;
	@BeforeSuite
	public void initBrowser()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN$\\Pictures\\sql\\selinium\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
     ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		options.addArguments("--incognito");
		
		options.addArguments("--start-maximized");
        
        
        
	    driver = new ChromeDriver(options);// chrome browser will get open

	//	driver.manage().window().maximize();// to maximize the window

		driver.get("https://kite.zerodha.com/");
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	@BeforeClass
	public void objectcreation() throws IOException
	{
		 lp =new Loginpage(driver);
		 db =new DashBoard(driver);
	}
}

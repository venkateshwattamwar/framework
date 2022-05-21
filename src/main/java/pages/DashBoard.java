package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {

	WebDriver driver;
	@FindBy(xpath = "//*[@type='button']")
    private	WebElement getstartedbutton;
	
	@FindBy(xpath = "//*[@class='instrument-search']//*[@type='text']")
	private WebElement searchbox;
	
	@FindBy(xpath = "//*[@class='eight columns text-right']//*[@class='button-outline button-blue']")
	private WebElement buybutton;
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement outerbuybutton;
	
	@FindBy(xpath = "//*[@class='message']")
	private WebElement textmessage;
	
	public DashBoard(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		this.driver=driver;
		
		PageFactory.initElements(driver, this);//it is class defined by java @find by annotation is used to loacte the webelement
	}                                         //all loactor are initionlize at a time
	public void clickOnGetStarted()
	{
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		getstartedbutton.click();
	}
	public void searchshears()
	{
	//	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		searchbox.sendKeys("SBIN");
		
		Actions act =new Actions (driver);
		
		act.sendKeys(Keys.ENTER).perform();
	}
	public void buyshears()
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		buybutton.click();
		outerbuybutton.click();
		String message = textmessage.getText();
		
	}
	
	
}

package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotMethodForProject {
		
		public static String m1(WebDriver driver, String Filename) throws IOException
		{
			
			  TakesScreenshot scr = (TakesScreenshot)driver;//type casting
			  
			  File source = scr.getScreenshotAs(OutputType.FILE);//screenshot ghete
			  
			  String path=System.getProperty("user.dir")+"\\screenshot\\"+Filename+".png";
			  
			  
			  File destination=new File(path);
			  
			  FileHandler.copy(source, destination);
			  return path;
			  
			
	}
	}



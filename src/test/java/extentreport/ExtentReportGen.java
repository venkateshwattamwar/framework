package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
    static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		String path=System.getProperty("user.dir")+"//reports//kitezerodhareport.html";
		
		ExtentHtmlReporter reporter =new ExtentHtmlReporter(path);
		
		reporter.config().setTheme(Theme.DARK);
		
		reporter.config().setReportName("zerodha report");
		
		extent=new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("project name", "kite zerodha");
		
		extent.setSystemInfo("Environment", "SIT");
		
		extent.setSystemInfo("executed by", "15 jan Batch");
		
		return extent;
		
		 
		
	}
}

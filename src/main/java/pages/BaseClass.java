package pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseClass  {
	Properties prop;
	FileInputStream fis;
	public BaseClass() throws IOException  {
	
    prop=new Properties();//config file read
	
	String path =System.getProperty("user.dir")+"\\config.properties";
	
	 fis =new FileInputStream(path);//read
	
	prop.load(fis);//load
	
	
	
	
	}
	

	
}

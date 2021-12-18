package Resource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basefile {
	
	public WebDriver driver;

	public WebDriver Utility() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream read= new FileInputStream("C:\\Users\\Amita Prajapati\\eclipse-workspace\\Matrimony\\src\\main\\java\\Resource\\Data.Properties");
		prop.load(read);
		String value =prop.getProperty("Browser");
		
		if(value.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Chrome\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	
	
		return driver;
	}

	
	
	
	}




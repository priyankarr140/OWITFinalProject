package Automation.Batch2FinalProjectUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		
		Properties prop=new Properties();

		FileInputStream fis =new FileInputStream("C:\\Users\\Priyanka\\eclipse-workspace\\Batch2FinalProject\\src\\main\\java\\data.properties");

		prop.load(fis);
		String browser=prop.getProperty("browser");
		if(browser.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","C:\\test2\\chromedriver.exe");
			 
			   driver=new ChromeDriver();
		     
		}
		
		
		return driver;
		
	}
	public void takeScreenshot(WebDriver driver,String path)
	{
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
        	String destinationFile = System.getProperty("user.dir")+"\\reports\\"+path+".png";
        	FileUtils.copyFile(scrFile,new File(destinationFile));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
			
		}
	}


}

package Automation.Batch2FinalProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Automation.Batch2FinalProjectUtil.Base;
import pageObjects.Login;


public class LoginTest extends Base{
	WebDriver driver;
	private static Logger log=LogManager.getLogger(LoginTest.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
	}
	@Test(dataProvider="getData")
	public void navigation(String username,String password) throws IOException, InterruptedException
	{
		
		
		
		log.info("URl launched");			
		Login l1=new Login(driver);
		l1.loginInput().sendKeys(username);
		Thread.sleep(5000);
		log.info("Username entered");
		log.info("Password entered");
		l1.loginPassword().sendKeys(password);
		Thread.sleep(5000);
	
			l1.loginBtn().click();
			Thread.sleep(5000);
			log.info("Logged In Successfully");
			l1.not_now().click();
			Thread.sleep(5000);
			l1.not_now().click();
			Thread.sleep(5000);
			l1.imageclick().click();
			Thread.sleep(5000);
			l1.change_pic().click();;
			Thread.sleep(5000);
			l1.upload().click();
			Runtime.getRuntime().exec("C://Users//Priyanka//Desktop//Selenium Training//autoit.exe");
			log.info("Test case successfullly run");
			Thread.sleep(5000);
		
		
		//l1.home().click();
		
		//failing the test case
		//SoftAssert soft=new SoftAssert();
		//soft.assertEquals(driver.getTitle(),"Priyanka Arora (@engineerdiaries101) • Instagram photos and videos");
		//Assert.assertTrue(true);
	
		
		//asert to compare
		
	}
	@DataProvider()
	public Object[][] getData()
	{
		Object[][] data=new Object[1][2];
		
		data[0][0]="engineerdiaries@gmail.com";
		data[0][1]="Priyanka@1";
		return data;
	}
	@AfterTest
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(10000);
		this.driver.close();
	}


}

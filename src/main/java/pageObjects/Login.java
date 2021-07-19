package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	
		// TODO Auto-generated method stub
		WebDriver driver;
		By signin=By.name("username");
		By signin_Pssrd=By.name("password");
		By login_btn=By.xpath("//*[text()='Log In']");
		By not_now=By.xpath("//*[text()='Not Now']");
		
		By imageclick=By.xpath("//*[@href='/engineerdiaries101/']");
		By changepic=By.xpath("//*[@alt='Change Profile Photo']");
		By uploadpic=By.xpath("//*[text()='Upload Photo']");
		
		public Login(WebDriver driver)
		{
			this.driver=driver;
		}
	
		
		public WebElement loginInput()
		{
			return driver.findElement(signin);
		}
		
		public WebElement change_pic()
		{
			return driver.findElement(changepic);
		}
		
		public WebElement not_now()
		{
			return driver.findElement(not_now);
		}
		public WebElement imageclick()
		{
			return driver.findElement(imageclick);
		}
		
		public WebElement upload()
		{
			return driver.findElement(uploadpic);
		}
		
		
		public WebElement loginPassword()
		{
			return driver.findElement(signin_Pssrd);
		}
		
		public WebElement loginBtn()
		{
			return driver.findElement(login_btn);
		}


	

}

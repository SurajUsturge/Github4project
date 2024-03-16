package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import all_method.BaseClass;

public class Login_Page 
{	static WebDriver driver=BaseClass.driver;


	public static void readloctrs(String username,String password) throws IOException
	{
		
		
//		login.properties=> locators properties file here
		String usernameloc=BaseClass.readlocators("username","loginLocator.properties");
	WebElement user=driver.findElement(By.xpath(usernameloc));
	user.sendKeys(username);
	
	String passwordloc=BaseClass.readlocators("password","loginLocator.properties");
	WebElement pass=driver.findElement(By.xpath(passwordloc));
	pass.sendKeys(password);
		
//	login button
	String loginlocator=BaseClass.readlocators("loginbtn", "loginLocator.properties");
	WebElement loginbutton=driver.findElement(By.xpath(loginlocator));
	loginbutton.click();
	
	}

}

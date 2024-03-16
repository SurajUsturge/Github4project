package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import all_method.BaseClass;
import pages.Login_Page;

public class Login_test 
{
	@BeforeTest
	public void beforetest()
	{
		  System.out.println("setting the chrome browser");
		  BaseClass.getDriver("chrome");
		  System.out.println("opening the url in chrome");
		  BaseClass.openUrl("https://askomdch.com/account/");
	}
	
	
	  @Test
	  public void login_test_with_valid_data() throws IOException, InterruptedException 
	  {
//		login.properties=> Test Data properties file "here"
		  System.out.println("fetching the test data to login");
		  String username=BaseClass.readtestdata("username","login.properties");
		  String password=BaseClass.readtestdata("password","login.properties");
		  Login_Page.readloctrs(username,password);
	  }
	

}

package TestCases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PagesClasses.LoginPage;
import TestBase.BaseTest;


public class LoginPageTest extends BaseTest {
	
@Test(dataProvider="dp")
	
	void Login(String user , String pass)
	{
	logger.info("Executing for Login Functionality....");
		LoginPage lp = new LoginPage(driver);
		logger.info("Creating Object for Login Page.....");
		lp.clickaccount();
		lp.clickloginagain();
		logger.info("Login with valid Credentials.....");
		lp.setUsername(user);
		lp.setPassname(pass);
		logger.info("Click on Login button....");
		lp.clickLogin();
		String Actual=driver.getTitle();
		String Expected = "My Account";
		if(Actual.equals(Expected))
		{
			lp.clickLogout();
			lp.clickcontinue();
			lp.clickaccount();
			lp.clickloginagain();
		    Assert.assertEquals(Actual, Expected);
		}
		else
		{
			
			Assert.assertEquals(Actual, Expected);
			
		}
	}

@DataProvider(name="dp")

Object[][] Login()
{
	Object data[][]= {
			
			{"aman1230@gmail.com","aman122"},
			
			
	};
	return data;
}

}

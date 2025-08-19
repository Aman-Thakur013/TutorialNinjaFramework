package TestCases;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PagesClasses.RegisterPage;
import TestBase.BaseTest;
import PagesClasses.LoginPage;

public class RegisterPageTest extends BaseTest{
	
	public String email = randomstring()+"@gmail.com";
	
	@Test(dataProvider="dp")
	void register(String first ,String last ,String email , String phone , String pass , String con_pass)
	{
		logger.info("Executing for Registration Functionality.....");
		RegisterPage rp = new RegisterPage(driver);
		logger.info("Creating objects for Register Page and Login Page.....");
		LoginPage lp = new LoginPage(driver);
		rp.ClickHomeAccount();
		rp.clickregisterdrpdwn();
		
		rp.clearfirstname();
		rp.setFirstname(first);
		rp.clearLastname();
		rp.setLastname(last);
		rp.clearEmail();
		rp.setEmail(email);
		System.out.println("Execution Started for email :" + email);
		rp.clearTelephone();
		rp.setTelephone(phone);
		rp.clearPassword();
		rp.setPassword(pass);
		rp.clearConfirmPassword();
		rp.setConfirmPassword(con_pass);
		rp.TermAndPolicy();
		rp.Continue();
		
		String Actual = driver.getTitle();
		
		String Expected = "Your Account Has Been Created!";
		
		if(Actual.equals(Expected))
		{
			rp.ClickContinueAfterRegister();
			lp.clickLogout();
			lp.clickcontinue();
			lp.clickaccount();
			rp.clickregisterdrpdwn();
			Assert.assertEquals(Actual, Expected ,"Welcome To tutorial Ninja");
		}
		
		else
		{
			
			Assert.assertEquals(Actual, Expected , "Please Try Again....! Thank You");
			
		}
	}
	
	@DataProvider(name="dp")
	
	Object[][] register()
	{
		Object data[][]= {
				{"Aman","Thakur",randomstring()+"@gmail.com","9854677215","aman0980","aman0980"},
				{"Aman","Thakur",randomstring()+"@gmail.com","9854677215","aman0987","aman0987"},
				{"Yash","Kashyap",randomstring()+"@gmail.com","9886847947","yash7890","yash7890"},
		};
		return data;
	}
}

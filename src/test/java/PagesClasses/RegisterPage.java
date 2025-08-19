package PagesClasses;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

WebDriver driver;
	
	//Constructor
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	By home_Account = By.xpath("//*[@class='dropdown']/a/span[2]");
	
	By drpdwn_register = By.xpath("//*[@class='dropdown-menu dropdown-menu-right']/li/a[1]");
	
	By txt_FirstName_loc =By.xpath("//*[@name='firstname']");
	
	By txt_LastName_loc =By.xpath("//*[@name='lastname']");
	
	By txt_Email_loc =By.xpath("//*[@name='email']");
	
	By txt_Phone_loc =By.xpath("//*[@name='telephone']");
	
	By txt_Password_loc =By.xpath("//*[@name='password']");
	
	By txt_ConfirmPassword_loc =By.xpath("//*[@name='confirm']");
	
	By checkbox_terms = By.xpath("//*[@name='agree']");
	
	By btn_submit = By.xpath("//*[@value='Continue']");
	
	By area_Screenshot = By.xpath("//*[@id=\"content\"]");
	
	By register_continue = By.xpath("//*[@class='pull-right']/a");

	
	//Action
	
	public void ClickHomeAccount()
	{
		driver.findElement(home_Account).click();
	}
	
	public void clickregisterdrpdwn()
	{
		driver.findElement(drpdwn_register).click();
	}
	public void clearfirstname()
	{
		driver.findElement(txt_FirstName_loc).clear();
	}
	
	public void setFirstname(String first)
	{
		driver.findElement(txt_FirstName_loc).sendKeys(first);
	}
	
	public void clearLastname()
	{
		driver.findElement(txt_LastName_loc).clear();
	}
	
	public void setLastname(String last)
	{
		driver.findElement(txt_LastName_loc).sendKeys(last);
	}
	
	public void clearEmail()
	{
		driver.findElement(txt_Email_loc).clear();
	}
	
	public void setEmail(String email)
	{
		driver.findElement(txt_Email_loc).sendKeys(email);
	}
	
	public void clearTelephone()
	{
		driver.findElement(txt_Phone_loc).clear();
	}
	
	public void setTelephone(String phone)
	{
		driver.findElement(txt_Phone_loc).sendKeys(phone);
	}
	public void clearPassword()
	{
		driver.findElement(txt_Password_loc).clear();
	}
	public void setPassword(String pass)
	{
		driver.findElement(txt_Password_loc).sendKeys(pass);
	}
	
	public void clearConfirmPassword()
	{
		driver.findElement(txt_ConfirmPassword_loc).clear();
	}
	
	public void setConfirmPassword(String con_pass)
	{
		driver.findElement(txt_ConfirmPassword_loc).sendKeys(con_pass);
	}
	
	public void TermAndPolicy()
	{
		driver.findElement(checkbox_terms).click();
		
	}
	
	public void Continue()
	{
		driver.findElement(btn_submit).click();
	}
	
	public File takescreenshot()
	{
		return(driver.findElement(area_Screenshot).getScreenshotAs(OutputType.FILE));
	}
	
	public void ClickContinueAfterRegister()
	{
		driver.findElement(register_continue).click();
	}
}

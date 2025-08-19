package PagesClasses;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
public class LoginPage {
    WebDriver driver;
	//Constructor
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
    
	By txt_Username_loc = By.xpath("//*[@name='email']");
	
	By txt_Password_loc=By.xpath("//*[@name='password']");
	
	By btn_Login = By.xpath("//*[@value='Login']");
	
	By btn_logout = By.xpath("//*[@class='list-group']/a[13]");
	
	By btn_continue = By.xpath("//*[@class='pull-right']/a");
	
	By btn_account = By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[2]");
	
	By btn_account_login = By.xpath("//*[@class='dropdown-menu dropdown-menu-right']/li[2]");
	
	By area_screenshot = By.xpath("//*[@id=\"content\"]/div/div[2]/div");
	
	
	//Action
	public void setUsername(String user)
	{
		driver.findElement(txt_Username_loc).sendKeys(user);
	}
	
	public void setPassname(String pass)
	{
		driver.findElement(txt_Password_loc).sendKeys(pass);
	}
	
	public void clickLogin()
	{
		driver.findElement(btn_Login).click();
	}
	
	public void clickLogout()
	{
		driver.findElement(btn_logout).click();
	}
	
	public void clickcontinue()
	{
		driver.findElement(btn_continue).click();
	}
	
	public void clickaccount()
	{
		
		driver.findElement(btn_account).click();
	}

	public void clickloginagain()
	{
		driver.findElement(btn_account_login).click();
	}
	
	public File takeScreenshot()
	{
		return(driver.findElement(area_screenshot).getScreenshotAs(OutputType.FILE));
	}
}

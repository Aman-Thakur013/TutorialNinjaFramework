package PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {


	WebDriver driver;
	
	//Constructor
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	
	By btn_checkout = By.xpath("//a[@title='Checkout']//i[@class='fa fa-share']");
	
	By Checkout = By.xpath("//a[@class='btn btn-primary']");
	
	//Actions
	
	public void Button()
	{
		driver.findElement(btn_checkout).click();
	}
	
	public void confirm()
	{
		driver.findElement(Checkout).click();
	}
}

package PagesClasses;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {

WebDriver driver;
	
	//Constructor
	
	public AddToCartPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	
	By click_item1 = By.xpath("//*[@class='button-group']/button[1]");
	
	By click_item2 = By.xpath("//body//div[@id='common-home']//div[@class='row']//div[@class='row']//div[2]//div[1]//div[3]//button[1]");
	
	By area_screenshot = By.xpath("/html/body");
	
	By cart_total = By.xpath("//*[@id=\"cart-total\"]");
	
	//Actions
	
	public void item1()
	{
		driver.findElement(click_item1).click();
	}
	
	public void item2()
	{
		driver.findElement(click_item2).click();
	}
	
	public File takescreenshot()
	{
		return(driver.findElement(area_screenshot).getScreenshotAs(OutputType.FILE));
	}
	
	public String cart_Total()
	{
		return (driver.findElement(cart_total).getText());
	}
}

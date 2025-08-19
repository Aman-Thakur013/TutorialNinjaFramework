package PagesClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

WebDriver driver;
	
	//Constructor
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locator
	
	By SearchField = By.xpath("//*[@name='search']");
	
	By btn_Search = By.xpath("//*[@class=\"btn btn-default btn-lg\"]");
	
	
	//Actions
	public void cleanSearch()
	{
		driver.findElement(SearchField).clear();
	}
	
	public void setSeachField(String search)
	{
		driver.findElement(SearchField).sendKeys(search);
	}
	
	public void clickSearch()
	{
		driver.findElement(btn_Search).click();
	}

}

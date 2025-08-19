package TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PagesClasses.SearchPage;
import TestBase.BaseTest;



public class SearchPageTest extends BaseTest {
	
	@Test(dataProvider="dp")
	void search(String search)
	{logger.info("Executing for Search Functionality........");
		SearchPage sp = new SearchPage(driver);
		logger.info("Creating object for Search Functionality......");
		sp.setSeachField(search);
		logger.info("Searching for :"+search);
		sp.cleanSearch();
		sp.clickSearch();
		
	}
	
	
	@DataProvider(name="dp")
	
	Object[][] search()
	{
		Object data[][]= {
				{"Mobile"},
				{"Monitor"},
		};
		return data;
	}
}

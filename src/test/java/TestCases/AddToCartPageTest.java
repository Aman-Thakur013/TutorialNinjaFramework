package TestCases;

import java.io.File;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import PagesClasses.AddToCartPage;
import TestBase.BaseTest;

public class AddToCartPageTest extends BaseTest {

	@Test
	void cart() throws InterruptedException
	{
		logger.info("Executing for Add to Cart Functionality....");
		AddToCartPage carts = new AddToCartPage(driver);
		logger.info("Creating Cart Obejct");
		Thread.sleep(3000);
		logger.info("Adding item1 to Cart");
		carts.item1();
		Thread.sleep(3000);
		logger.info("Adding item2 to Cart");
		carts.item2();
		
		Thread.sleep(3000);
		logger.info("Fetching The Total Price of Cart");
		String Result = carts.cart_Total();
		
		String Result1 = Result.replace("$", "").replace("-", "").replace("(s)","").replace(".", "");
		System.out.println("Number of Item And Price is :"+Result);
		String Expected = " 2 item(s) - $725.20";
		String Expected1 = Result.replace("$", "").replace("-", "").replace("(s)","").replace(".", "");
		logger.info("Comparing Actual and Expected Results");
		if(Result1.equals(Expected1))
		{
			Assert.assertEquals(Result1, Expected1,"Pass");
		}
		else
		{
			
			Assert.assertEquals(Result1, Expected1, "Fail");
		}
	}
}

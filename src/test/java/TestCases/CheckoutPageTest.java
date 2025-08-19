package TestCases;

import org.testng.annotations.Test;

import TestBase.BaseTest;
import PagesClasses.AddToCartPage;
import PagesClasses.CheckoutPage;

public class CheckoutPageTest extends BaseTest {

	@Test
	void checkout()
	{
		logger.info("Executing Checkout functionality....");
		AddToCartPage cart = new AddToCartPage(driver);
		logger.info("Creating objects of Cart and checkout..");
		CheckoutPage check = new CheckoutPage(driver);
		cart.item1();
		logger.info("Adding item1 and Item 2 in cart......");
		cart.item2();
		check.Button();
		logger.info("Click on checkout button....");
		check.confirm();
	}

}

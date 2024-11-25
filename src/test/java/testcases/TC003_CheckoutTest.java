package testcases;

import java.util.HashMap;

import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.UtilMethods;

public class TC003_CheckoutTest extends UtilMethods {

	@Test(dataProvider = "getData")
	public void checkout(HashMap<String, String> input) {
		LoginPage login = new LoginPage();
		login.enterUsername(input.get("username")).enterPassword(input.get("password")).clickSubmit();

		ProductPage product = new ProductPage();
		product.clickAddToCart().clickAddToCartLink();

		CartPage cart = new CartPage();
		cart.clickCheckout();

		CheckoutPage check = new CheckoutPage();
		check.enterFirstName().enterLastName().enterPostalCode().clickContinue();
	}
}
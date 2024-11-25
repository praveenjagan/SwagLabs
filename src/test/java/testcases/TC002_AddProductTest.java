package testcases;

import java.util.HashMap;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ProductPage;
import utils.UtilMethods;

public class TC002_AddProductTest extends UtilMethods {

	@Test(dataProvider = "getData")
	public void addProduct(HashMap<String, String> input) {
		LoginPage login = new LoginPage();
		login.enterUsername(input.get("username")).enterPassword(input.get("password")).clickSubmit();

		ProductPage product = new ProductPage();
		product.clickAddToCart().clickAddToCartLink();
	}

}

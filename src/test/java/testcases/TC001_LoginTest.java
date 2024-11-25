package testcases;

import java.util.HashMap;

import org.testng.annotations.Test;

import pages.LoginPage;
import utils.UtilMethods;

public class TC001_LoginTest extends UtilMethods {
	
	@Test(dataProvider = "getData")
	public void loginApp(HashMap<String, String> input) {
		LoginPage login = new LoginPage();
		login.enterUsername(input.get("username")).enterPassword(input.get("password")).clickSubmit();	
	}
}

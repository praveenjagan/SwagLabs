package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilMethods;

public class CartPage extends UtilMethods {

	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using ="checkout")
	WebElement eleCheckout;
	
	public CartPage clickCheckout() {
		eleCheckout.click();
		return this;
	}
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilMethods;

public class ProductPage extends UtilMethods {
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.ID, using="add-to-cart-sauce-labs-backpack")
	WebElement eleAddToCart;
	
	public ProductPage clickAddToCart() {
		eleAddToCart.click();
		return this;
	}
	
	@FindBy(how = How.CLASS_NAME, using ="shopping_cart_link")
	WebElement eleAddToCartLink;
	
	public ProductPage clickAddToCartLink() {
		eleAddToCartLink.click();
		return this;
	}
}

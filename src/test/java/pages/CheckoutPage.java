package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.UtilMethods;

public class CheckoutPage extends UtilMethods {

	public CheckoutPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "first-name")
	WebElement eleFirstName;

	public CheckoutPage enterFirstName() {
		eleFirstName.sendKeys("Test");
		return this;
	}
	
	@FindBy(how = How.ID, using = "last-name")
	WebElement eleLastName;

	public CheckoutPage enterLastName() {
		eleLastName.sendKeys("Test");
		return this;
	}
	
	@FindBy(how = How.ID, using = "postal-code")
	WebElement elePostalCode;

	public CheckoutPage enterPostalCode() {
		elePostalCode.sendKeys("123456");
		return this;
	}
	
	@FindBy(how = How.ID, using = "continue")
	WebElement eleContinue;

	public CheckoutPage clickContinue() {
		eleContinue.click();
		return this;
	}
	
}

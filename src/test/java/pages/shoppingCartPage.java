package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class shoppingCartPage {

	public shoppingCartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//a[@class='product-name']")
	public WebElement shoppingCartItem;

	@FindBy(xpath = "//span[@class='product-unit-price']")
	public WebElement price;

	@FindBy(xpath = "//input[@class='qty-input']")
	public WebElement quantityTextBox;

	@FindBy(xpath = "//span[@class='product-subtotal']")
	public WebElement Total;

	@FindBy(xpath = "//*[@class='page-title']")
	public WebElement pageTitle;
	
	@FindBy(id="updatecart")
	public WebElement updateShoppingCart;

}

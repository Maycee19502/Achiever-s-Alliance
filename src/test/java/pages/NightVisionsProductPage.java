package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class NightVisionsProductPage {

	public NightVisionsProductPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//div[@class=\"product-name\"]")
	public WebElement ItemName;
	
	@FindBy(id="price-value-34")
	public WebElement ItemPrice;
	
	@FindBy(id="product_enteredQuantity_34")
	public WebElement ItemQuantity;
	
	@FindBy(xpath="//*[@id='add-to-cart-button-34']")
	public WebElement AddToCart;
	
	@FindBy(xpath="//*[@class='cart-label']")
	public WebElement ShoppingCartIcon;
}

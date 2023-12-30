package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ShoesPage {

	public ShoesPage() {

		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//h2[@class='product-title']//a[contains (text(), 'adidas Consortium Campus 80s Running Shoes')]")
	public WebElement adidasConsortiumCampus80s;

	@FindBy(xpath = "//select[@name='product_attribute_9']")
	public WebElement selectSizeDropDown;

	@FindBy(xpath = "//select[@name='product_attribute_9']//option[@value='21']")
	public WebElement size8;

	@FindBy(xpath = "//ul[@id='color-squares-10']")
	public WebElement colorBlock;

	@FindBy(xpath = "//span[@id='price-value-25']")
	public WebElement priceBlock;
	
	@FindBy(xpath = "//span[contains(text(), '$27.56')]")
	public WebElement adidasConsortPrice;

}

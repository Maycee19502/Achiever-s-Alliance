package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class CellPhonePage {

	public CellPhonePage() {

		PageFactory.initElements(BaseClass.getDriver(), this);

	}

	@FindBy(xpath = "//h2[@class='product-title']//a[contains(text(), 'HTC One M8 Android L 5.0 Lollipop')]")
	public WebElement HtcOneM8TextLink;

	@FindBy(xpath = "//div[@class='compare-products']")
	public WebElement AddToCompareProductPage;

	@FindBy(xpath = "//div[@class='bar-notification success']//a[contains(text(), 'product comparison')]")
	public WebElement ProductComparisonPopupLink;
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class NotebookPage {

	public NotebookPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);

	}

	@FindBy(xpath = "//*[@class='details']/h2//a[contains(text(), 'Apple MacBook Pro 13-inch')]")
	public WebElement appleNotebookPro;

	@FindBy(xpath = "//div[@class='compare-products']")
	public WebElement AddToCompareProductPage;
}

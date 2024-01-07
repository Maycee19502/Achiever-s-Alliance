package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class NewsPage {

	public void NewsPage() {

		PageFactory.initElements(BaseClass.getDriver(), this);

	}

	@FindBy(xpath = "//a[@class='news-title'][contains(text(), 'New online store is open')]")
	public WebElement NewOline;

	@FindBy(xpath = "//a[@class='news-title'][contains(text(), 'nopCommerce new release')]")
	public WebElement NewRelease;

	@FindBy(xpath = "//a[@class='news-title'][contains(text(), 'About nopCommerce')]")
	public WebElement About;

}

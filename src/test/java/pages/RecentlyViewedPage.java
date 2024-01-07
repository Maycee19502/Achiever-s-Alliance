package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class RecentlyViewedPage {

	public RecentlyViewedPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[@class='page-title']")
	public WebElement RecentlyViewedPageTitle;

}

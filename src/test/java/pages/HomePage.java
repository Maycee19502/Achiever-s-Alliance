
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomePage {

	public HomePage() {
		
		
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[@class='footer-block my-account']/ul/li[1]/a")
	public WebElement MyAccountButton;

	@FindBy(xpath = "//div[@class='footer-block my-account']/ul/li[3]/a")
	public WebElement AddressesButton;

	@FindBy(xpath = "//div[@class='footer-block my-account']/ul/li[2]/a")
	public WebElement OrdersButton;

	@FindBy(xpath = "//div[@class='footer-block information']/ul/li[1]/a")
	public WebElement SiteMapButton;

	@FindBy(xpath = "//div[@class='page-body']/div[4]/div[2]/ul/li[3]/a")
	public WebElement NikeButton;

	@FindBy(xpath = "//div[@class='footer-block information']/ul/li[3]/a")
	public WebElement Privacy_NoticeButton;

	@FindBy(xpath = "//div[@class='footer-block information']/ul/li[6]/a")
	public WebElement Contact_UsButton;

	@FindBy(xpath = "//textarea[@class='enquiry']")
	public WebElement EnquiryTextBox;

	@FindBy(xpath = "//div[@class='buttons']/button")
	public WebElement SubmitButton;

	@FindBy(xpath = "//div[@class='result']")
	public WebElement Result;

	@FindBy(xpath = "//div[@class='category-grid home-page-category-grid']/div/div[1]/div/h2/a")
	public WebElement ElectronicsButton;

	@FindBy(xpath = "//div[@class='header-logo']/a/img")
	public WebElement LogoButton;

	@FindBy(xpath = "//div[@class='category-grid home-page-category-grid']/div/div[2]/div/h2/a")
	public WebElement ApparelButton;

	@FindBy(xpath = "//div[@class='category-grid home-page-category-grid']/div/div[3]/div/h2/a")
	public WebElement DigitalDownloadButton;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div/div[1]/div/div[2]/h2/a")
	public WebElement BuildYourOwnComputerButton;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div/div[2]/div/div[2]/h2/a")
	public WebElement AppleMacbookButton;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div/div[3]/div/div[2]/h2/a")
	public WebElement HTCOneButton;

	@FindBy(xpath = "//div[@class='product-grid home-page-product-grid']/div/div[4]/div/div[2]/h2/a")
	public WebElement VirtualGiftCardButton;

	@FindBy(xpath = "//div[@class='master-wrapper-content']/div/div/div/div/div[5]/div[2]/div[1]/div[1]/a")
	public WebElement FirstNews;

	@FindBy(xpath = "//div[@class='master-wrapper-content']/div/div/div/div/div[5]/div[2]/div[2]/div[1]/a")
	public WebElement SecondNews;

	@FindBy(xpath = "//div[@class='master-wrapper-content']/div/div/div/div/div[5]/div[2]/div[3]/div[1]/a")
	public WebElement ThirdNews;

}

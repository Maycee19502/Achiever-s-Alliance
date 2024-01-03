package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomePage {

	public HomePage() {

		PageFactory.initElements(BaseClass.getDriver(), this);

	}

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

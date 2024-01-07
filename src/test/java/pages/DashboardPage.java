package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage {

	public DashboardPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);

	}

	@FindBy(xpath = "//*[@id='topcartlink' ]//[contains(text(),'Shopping cart')]")
	public WebElement ShoppingCart;

	@FindBy(xpath = "//div[@class='header-links']/ul/li[2]")
	public WebElement logoutButton;

	@FindBy(xpath = "//ul[@class='top-menu notmobile']")
	public WebElement topMenuBar;

	@FindBy(xpath = "//*[@class='top-menu notmobile']//a[contains(text(),'Computers ')]")
	public WebElement Computers;

	@FindBy(xpath = "//*[@class='sublist first-level']//a[contains(text(),'Notebooks')]")
	public WebElement computerDropDownNotebook;

	@FindBy(xpath = "//*[@class='top-menu notmobile']//a[contains(text(),'Electronics ')]")
	public WebElement Electronics;

	@FindBy(xpath = "//*[@class='sublist first-level']//a[contains(text(),'Cell phones')]")
	public WebElement electronicsDropDownCellPhones;

	@FindBy(xpath = "//*[@class='top-menu notmobile']//a[contains(text(),'Apparel ')]")
	public WebElement Apparel;

	@FindBy(xpath = "//ul[@class='sublist first-level']//a[contains(text(), 'Shoes')]")
	public WebElement ApparelDropDownShoes;

	@FindBy(xpath = "//*[@class='top-menu notmobile']//a[contains(text(),'Digital downloads ')]")
	public WebElement DigitalDownloads;

	@FindBy(xpath = "//*[@class='top-menu notmobile']//a[contains(text(),'Books ')]")
	public WebElement Books;

	@FindBy(xpath = "//*[@class='top-menu notmobile']//a[contains(text(),'Jewelry ')]")
	public WebElement Jewelry;

	@FindBy(xpath = "//*[@class='top-menu notmobile']//a[contains(text(),'Gift Cards ')]")
	public WebElement GiftCards;

	@FindBy(id = "small-searchterms")
	public WebElement SearchBar;


	@FindBy(xpath = "//button[@type='submit']")
	public WebElement SearchButton;

	@FindBy(xpath = "//div[@class='header-logo']")
	public WebElement Logo;
	
	@FindBy(xpath = "//a[contains(text(),'New online store is open!')]")
    public WebElement NewOnlineStoreIsOpen;
	
	
	@FindBy(xpath = "//a[contains(text(),'nopCommerce new release!')]")
	public WebElement nopCommerceNewRelease;
	
	@FindBy(xpath="//a[contains(text(),'About nopCommerce')]")
	public WebElement AboutNopCommerce;
	
	@FindBy(xpath = "//*[@class='master-wrapper-page']/div/div/div/div/select")
	public WebElement customerCurrency;
	
	@FindBy(xpath = "//*[@class='header-links']/ul/li[3]/a/span[1]")
	public WebElement Wishlist;
	
	@FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
	public WebElement Close;
	
	@FindBy(xpath = "//*[@class='master-wrapper-page']/div/div/div/div/select/option[2]")
	public WebElement Euro;
	
}

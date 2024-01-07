package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	
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
	
	@FindBy(xpath = "//ul[@class='list']//a[@href='/news']")
	public WebElement NewsLink;
	
	@FindBy(xpath = "//ul[@class='list']//a[@href='/blog']")
	public WebElement BlogLink;
	
	@FindBy(xpath = "//a[@href=\"/recentlyviewedproducts\"]")
	public WebElement RecentlyViewedLink;
	
	
	
	
}

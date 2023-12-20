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
	@FindBy(xpath = "//div[@class='header-links']/ul/li[2]")
	public WebElement logoutButton;
	
	@FindBy(xpath="//[@class='top-menu notmobile'] /li[1]/a") 
    public WebElement Computers;

    @FindBy(xpath="//[@class='top-menu notmobile'] /li[2]/a") 
    public WebElement Electronics;

    @FindBy(xpath="//[//[@class='top-menu notmobile'] /li[3]/a") 
    public WebElement Apparel;

    @FindBy(xpath="//[@class='top-menu notmobile'] /li[4]/a") 
    public WebElement DigitalDownloads;

    @FindBy(xpath="//[@class='top-menu notmobile'] /li[5]/a") 
    public WebElement Books;

    @FindBy(xpath="//[@class='top-menu notmobile'] /li[6]/a") 
    public WebElement Jewelry;

    @FindBy(xpath="//[@class='top-menu notmobile'] /li[7]/a") 
    public WebElement GiftCards;

    @FindBy(id="small-searchterm")
    public WebElement SearchBar;

    @FindBy(xpath="//[@type='submit']")
    public WebElement SearchButton;

    @FindBy(xpath="//[@class='header-logo']")
    public WebElement Logo;
	

}

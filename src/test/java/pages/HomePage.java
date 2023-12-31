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
	
	@FindBy(xpath="//div[@class='footer-block my-account']/ul/li[3]/a")
	public WebElement AddressesButton;
	
	@FindBy(xpath="//div[@class='footer-block my-account']/ul/li[2]/a")
	public WebElement OrdersButton;
	
}

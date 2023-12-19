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
	
	
	

}

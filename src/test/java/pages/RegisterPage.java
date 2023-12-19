package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class RegisterPage {

	public RegisterPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }
    
    
    
   @FindBy(xpath = "//div[@class= 'header-links']/ul/li[1]")
	public WebElement registerButton;
}
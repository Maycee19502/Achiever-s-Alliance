package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;



public class LoginPage {
	
	public LoginPage() {
        PageFactory.initElements(BaseClass.getDriver(), this);
    }
    
    
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    public WebElement errorMessage;
   @FindBy(xpath = "//div[@class='header-links']/ul/li[2]")
	public WebElement loginButton;
    @FindBy(xpath= "//input[@class='email']")
    public WebElement email;
    
    @FindBy(xpath="//input[@class='password']")
    public WebElement password;

    @FindBy(xpath="//button[@class='button-1 login-button']")
    public WebElement signInButton;
    
    @FindBy(xpath = "//button[@class='button-1 register-button']")
    public WebElement registerButton;
}

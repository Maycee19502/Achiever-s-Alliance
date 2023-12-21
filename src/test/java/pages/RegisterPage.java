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
	public WebElement homePageRegisterButton;
   
   @FindBy(xpath = "//input[@id ='FirstName']")
   public WebElement firstName;
   
   @FindBy(xpath = "//input[@id ='LastName']")
   public WebElement lastName;
   
   @FindBy(xpath = "//input[@id ='Email']")
   public WebElement email;
   
   @FindBy(xpath = "//input[@id ='Password']")
   public WebElement password;
   
   @FindBy(xpath = "//input[@id ='ConfirmPassword']")
   public WebElement confirmPassword;
   
   @FindBy(xpath = "//button[@name='register-button']")
   public WebElement register;
   
   @FindBy(xpath = "//div[@class='buttons']/a [@class='button-1 register-continue-button\']")
   public WebElement continueButton;
}
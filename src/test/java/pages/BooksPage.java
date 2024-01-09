package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class BooksPage {

	public BooksPage(){
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
		@FindBy(xpath = "//h2[@class=\"product-title\"]//a[@href=\"/first-prize-pies\"]")
		public WebElement FirstPrizePies;
	
		
		
		
		
		
		
		
	}
	
	
	

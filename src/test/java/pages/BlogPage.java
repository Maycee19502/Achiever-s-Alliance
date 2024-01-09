package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class BlogPage {
	
	public BlogPage() {
	
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath="//a[@class='post-title'][contains(text(), 'Why your online store needs a wish list')]")
	public WebElement Blog1; 
	
	@FindBy(xpath="//a[@class='post-title'][contains(text(), 'How a blog can help your growing e-Commerce business')]")
	public WebElement Blog2; 
}

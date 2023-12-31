package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ReviewPage {

	public ReviewPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//div[@class='product-review-links']//a[contains(text(), 'review(s)')]")
	public WebElement productReviewsLink;

	@FindBy(xpath = "//input[@class='review-title']")
	public WebElement reviewTitle;

	@FindBy(xpath = "//div[@class='inputs']/textarea")
	public WebElement reviewTextArea;

	@FindBy(xpath = "//input[@value='1']")
	public WebElement reviewRadioButton1;

	@FindBy(xpath = "//button[@name='add-review']")
	public WebElement reviewSubmitButton;

	@FindBy(xpath = "//div[contains (text(), 'review text area test')]")
	public WebElement verifyReviewSubmission;

	@FindBy(xpath = "//div[@class='result']")
	public WebElement reviewSuccessfullyAdded;

//	@FindBy(xpath = "")
//	public  WebElement ;
}

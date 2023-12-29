package testCases.AprilDiehl_ProductDetailPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;
import utilities.Constants;

public class TC1_verifyReviewFunctionality extends CommonMethods {

	@Test
	public void verifyReviewFunc() {
		
		super.verifyURL();
		Actions actions = new Actions(BaseClass.getDriver());
		actions.moveToElement(dp.Computers).build().perform();
		super.hardWait(3);
		dp.computerDropDownNotebook.click();
		notebook.appleNotebookPro.click();
		review.productReviewsLink.click();
		review.reviewTitle.sendKeys(BaseClass.getProperty("reviewTitle"));
		review.reviewTextArea.sendKeys(BaseClass.getProperty("reviewTextArea"));
		review.reviewRadioButton1.click();
		review.reviewSubmitButton.click();
		review.reviewSuccessfullyAdded.isDisplayed();
		review.verifyReviewSubmission.isDisplayed();

//		System.out.println("on review submission page" + review.verifyReviewSubmission.toString());

//		WebElement computers = BaseClass.getDriver()
//				.findElement(By.xpath("//*[@class='top-menu notmobile']//a[contains(text(),'Computers ')]"));

//		      WebElement notebook=BaseClass.getDriver().findElement(By.xpath("//*[@class='sublist first-level']//a[contains(text(),'Notebooks')]"));	         
//		     notebook.click();

		// appleNotebookPro=
		// BaseClass.getDriver().findElement(By.xpath("//*[@class='details']/h2//a[contains(text(),
		// 'Apple MacBook Pro 13-inch')]"));
		// appleNotebookPro.click();

//		     WebElement productReviewsLink = BaseClass.getDriver().findElement(By.xpath("//div[@class='product-review-links']//a[contains(text(), 'review(s)')]"));
//		     productReviewsLink.click();
//		     
//		     WebElement reviewTitle = BaseClass.getDriver().findElement(By.xpath("//input[@class='review-title']"));
//		     reviewTitle.sendKeys("Review title test text");
//		     
//		     WebElement reviewTextArea = BaseClass.getDriver().findElement(By.xpath("//div[@class='inputs']/textarea"));
//		     reviewTextArea.sendKeys("review text area test");
//		     
//		     WebElement reviewRadioButton1 = BaseClass.getDriver().findElement(By.xpath("//input[@value='1']"));
//		     reviewRadioButton1.click();
//		     
//		     WebElement reviewSubmitButton = BaseClass.getDriver().findElement(By.xpath("//button[@name='add-review']"));
//		     reviewSubmitButton.click();
	}

}

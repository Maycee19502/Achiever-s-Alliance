package testCases.AprilDiehl_ProductDetailPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;
import utilities.ListenersTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListenersTestNG.class)
public class TC2_verifyProductComparisonFunctionality extends CommonMethods {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyProductComparisonFunctionality() {
		
		verifyURL();
		deleteAllCookies();
		mouseHoverOver(dp.Electronics);
		hardWait(2);
		dp.electronicsDropDownCellPhones.click();
		cell.HtcOneM8TextLink.click();
		cell.AddToCompareProductPage.click();
		hardWait(2);
		cell.ProductComparisonPopupLink.click();
		verifyAnyUrl("https://demo.nopcommerce.com/compareproducts");
		Assert.assertTrue(cell.HtcOneM8ImageLink.isDisplayed(), BaseClass.getProperty("htcOneImageLinkError"));

	}
}

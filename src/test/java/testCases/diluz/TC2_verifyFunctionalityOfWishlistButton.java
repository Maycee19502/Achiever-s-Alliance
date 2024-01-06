package testCases.diluz;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC2_verifyFunctionalityOfWishlistButton extends CommonMethods{

	@Test
	public void verifyFunctionalityOfWishlistButton() throws InterruptedException {
		String expectedUrl = BaseClass.getProperty("url");
		String ActualUrl = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, ActualUrl);
		
		Thread.sleep(3000);
		
		dp.SearchBar.sendKeys("HTC One M8 Android L 5.0 Lollipop");
		dp.SearchButton.click();
		
		Thread.sleep(3000);
		
		cell.HtcOneM8TextLink.click();
		cell.AddToWishlistButton.click();
		
		dp.Close.click();
		dp.Wishlist.click();
		
		Thread.sleep(3000);
	} 
}
 
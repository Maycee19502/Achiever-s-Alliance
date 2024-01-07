package testCases.Summer_CustumerService;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC3_Recently_viewed_Products extends CommonMethods {

	@Test
	public static void Customer() {

		verifyURL();
		dp.Books.click();
		bp.FirstPrizePies.click();
		hp.RecentlyViewedLink.click();
		verifyAnyUrl(BaseClass.getProperty("recentlyViewedURL"));
		Assert.assertTrue(rvp.RecentlyViewedPageTitle.isDisplayed(),"Recently Viewed is NOT Displayed");
		Assert.assertTrue(bp.FirstPrizePies.isDisplayed(), "First Prize Pies is NOT Displayed");
		
	}
}


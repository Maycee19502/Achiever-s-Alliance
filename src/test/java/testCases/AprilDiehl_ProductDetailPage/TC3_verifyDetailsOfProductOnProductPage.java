package testCases.AprilDiehl_ProductDetailPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;
import utilities.ListenersTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListenersTestNG.class)
public class TC3_verifyDetailsOfProductOnProductPage extends CommonMethods {

	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void verifyDetailsOfProductsPage() {
		verifyURL();
		deleteAllCookies();
		mouseHoverOver(dp.Apparel);
		hardWait(3);
		dp.ApparelDropDownShoes.click();
		shoe.adidasConsortiumCampus80s.click();
		shoe.selectSizeDropDown.click();
		shoe.size8.click();
		Assert.assertTrue(shoe.colorBlock.isDisplayed(), BaseClass.getProperty("adidasColorBlockError"));
		Assert.assertTrue(shoe.priceBlock.isDisplayed(), BaseClass.getProperty("adidasConsortiumPriceError"));
		shoe.adidasConsortPrice.equals(BaseClass.getProperty("adidasConsortiumCampus"));
		
	}
}

package anumTestCase;


import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class HomePage_Banner3 extends CommonMethods {
	@Test
	public void VerifyThirdbanner() {
		
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.FirstNews);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("New online store"));
		click(hp.LogoButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.SecondNews);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("nopCommerce"));
		click(hp.LogoButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.ThirdNews);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("About"));

	}
}

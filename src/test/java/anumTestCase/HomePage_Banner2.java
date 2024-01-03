package anumTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class HomePage_Banner2 extends CommonMethods {

	
	@Test
	public void VerifySecondBanner() {

		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.BuildYourOwnComputerButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("Build your own computer"));
		click(hp.LogoButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.AppleMacbookButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("Apple MacBook"));
		click(hp.LogoButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.HTCOneButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("HTC One"));
		click(hp.LogoButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.VirtualGiftCardButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("Virtual Gift Card"));

	}

}

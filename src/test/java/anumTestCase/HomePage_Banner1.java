package anumTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class HomePage_Banner1 extends CommonMethods {

	@Test
	public void VerifyFirstbanner() {
		
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.ElectronicsButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("Electronics"));
		click(hp.LogoButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.ApparelButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("Apparel"));
		click(hp.LogoButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.DigitalDownloadButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("Digital"));
	}

}

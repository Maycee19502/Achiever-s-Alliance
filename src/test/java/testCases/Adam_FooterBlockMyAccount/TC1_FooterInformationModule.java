package testCases.Adam_FooterBlockMyAccount;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC1_FooterInformationModule extends CommonMethods {

	@Test
	public void VerifySiteMapButton() {

		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.SiteMapButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("Sitemap"));
		click(hp.NikeButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("Nike"));
	}

}

package testCases.Adam_FooterBlockMyAccount;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC2_FooterInformationModule extends CommonMethods {
	
	
	@Test
	public void VerifyPrivacyNoticeButton() {

		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.Privacy_NoticeButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("Privacy"));
	}

}

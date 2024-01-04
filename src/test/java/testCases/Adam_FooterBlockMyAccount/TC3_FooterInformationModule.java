package testCases.Adam_FooterBlockMyAccount;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC3_FooterInformationModule extends CommonMethods {
	
	@Test
	public void VerifyContactUsButton() {
		
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.Contact_UsButton);
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("Contact"));
		sendText(hp.EnquiryTextBox, BaseClass.getProperty("enquiry"));
		click(hp.SubmitButton);
		Assert.assertEquals(hp.Result.getText(), BaseClass.getProperty("result"));
		
		
		
	}
	

}

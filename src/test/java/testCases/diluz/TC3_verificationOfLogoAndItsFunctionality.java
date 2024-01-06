package testCases.diluz;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC3_verificationOfLogoAndItsFunctionality extends CommonMethods {

	@Test
	public void verificationOfLogoAndItsFunctionality() throws InterruptedException {
		
		String expectedUrl = BaseClass.getProperty("url");
		String ActualUrl = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, ActualUrl);
		
		Thread.sleep(3000);
		dp.GiftCards.click();
		
		dp.Logo.isDisplayed();
		
		Thread.sleep(3000);
		
	    click(dp.Logo);
	    Thread.sleep(2000);
	    
	      
	}
}


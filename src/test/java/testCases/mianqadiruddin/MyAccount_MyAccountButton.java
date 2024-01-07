package testCases.mianqadiruddin;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class MyAccount_MyAccountButton extends CommonMethods {

	@Test
	public void verifyMyAccountButton() {
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.MyAccountButton);
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("https://demo.nopcommerce.com/customer/info"));
	}
	
}

package testCases.mianqadiruddin;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class MyAccount_AddressesButton extends CommonMethods {
	@Test
	public void verifyAddressesButton() {
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.AddressesButton);
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("https://demo.nopcommerce.com/customer/addresses"));
	}
	}
	
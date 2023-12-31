package testCases.mianqadiruddin;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class MyAccount_OrdersButton extends CommonMethods {

	@Test
	public void verifyOrdersButton() {
		Assert.assertTrue(BaseClass.getDriver().getTitle().contains("demo store"));
		click(hp.OrdersButton);
		Assert.assertTrue(BaseClass.getDriver().getCurrentUrl().contains("https://demo.nopcommerce.com/order/history"));
	
	}
}

package testCases.diluz;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC1_verificationCurrencyChangeFeature extends CommonMethods {

	@Test
	public void verificationCurrencyChangeFeature() throws InterruptedException {

		String expectedUrl = BaseClass.getProperty("url");
		String ActualUrl = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, ActualUrl);

		Thread.sleep(3000);

		Select sel = new Select(dp.customerCurrency);
		// .customerCurrency.click();
		// String option = "Euro";
		dp.customerCurrency.click();
		Thread.sleep(3000);

		dp.Euro.click();
		dp.SearchBar.sendKeys("Apple MacBook Pro 13-inch");
		dp.SearchButton.click();
		Thread.sleep(3000);

		dp.Euro.isDisplayed();

		hardWait(2);

		// sel.getFirstSelectedOption();
		// Thread.sleep(2000);

		// sel.deselectByValue("EURO");

		// Select sel = new Select(dp.customerCurrency);
		// sel.selectByVisibleText("US Dollar");

		// dp.customerCurrency.click();

	}

}

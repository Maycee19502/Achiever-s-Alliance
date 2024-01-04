package testCases.Sharifa_Mustafa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class Sharifa_TestCases extends CommonMethods {
	@Test(enabled = false)
	public static void TC01_VerifySearchBarFunctinality() {
		String expectedUrl = BaseClass.getProperty("url");
		String ActualUrl = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, ActualUrl);
		Assert.assertTrue(dp.SearchBar.isDisplayed());
		CommonMethods.sendText(dp.SearchBar, BaseClass.getProperty("searchItem1"));
		dp.SearchButton.click();
		// WebElement searchResult =
		// BaseClass.getDriver().findElement(By.xpath("//h2[@class='product-title']"));
		String ActualPageTitle = BaseClass.getDriver().getTitle();
		String expectedPageTitle = "nopCommerce demo store. Search";
		Assert.assertEquals(ActualPageTitle, expectedPageTitle);
		WebElement searchResultItem = BaseClass.getDriver().findElement(By.xpath("//h2[@class='product-title']"));
		String searchResult = searchResultItem.getText();
		Assert.assertTrue(searchResult.contains("MacBook"));

	}

	@Test(enabled = false)
	public void TC02_VerifySearchButtonPresence() {
		String expectedUrl = BaseClass.getProperty("url");
		String ActualUrl = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, ActualUrl);
		Assert.assertTrue(dp.SearchButton.isDisplayed());
		CommonMethods.sendText(dp.SearchBar, BaseClass.getProperty("searchItem2"));
		dp.SearchButton.click();

	}

	@Test(enabled = true)
	public void VerifySearchKeywordFunctionality() {
		String expectedUrl = BaseClass.getProperty("url");
		String ActualUrl = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, ActualUrl);
		CommonMethods.sendText(dp.SearchBar, BaseClass.getProperty("searchItem3"));
		dp.SearchButton.click();

		String ActualPageTitle = BaseClass.getDriver().getTitle();
		String expectedPageTitle = "nopCommerce demo store. Search";
		Assert.assertEquals(ActualPageTitle, expectedPageTitle);

		WebElement searchKeyword = BaseClass.getDriver().findElement(By.xpath("//*[@id='q']"));
		CommonMethods.sendText(searchKeyword, BaseClass.getProperty("searchUpdate"));

		WebElement search = BaseClass.getDriver().findElement(By.xpath("//*[@class='button-1 search-button']"));
		search.click();

//		WebElement message=BaseClass.getDriver().findElement(By.xpath("//div[@class='no-result']"));
//		message.getText();
//
//		String actualMessage=message.getText();
//		String expectedMessage="No products were found that matched your criteria.";
//		
	}
}

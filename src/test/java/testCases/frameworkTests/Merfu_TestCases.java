package testCases.frameworkTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class Merfu_TestCases extends CommonMethods {
	@Test(enabled = false)
	public static void TC01_VerifyShoppingCartIcon() {
		String expectedUrl = BaseClass.getProperty("url");
		String ActualUrl = BaseClass.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, ActualUrl);

		Assert.assertTrue(dp.ShoppingCart.isDisplayed());

		dp.ShoppingCart.click();
		String ActualMsg = BaseClass.getDriver().findElement(By.xpath("//*[@class='page-title']")).getText();
		String ExpectedMsg = "Shopping cart";
		Assert.assertEquals(ActualMsg, ExpectedMsg);
	}

	@Test(enabled = true)
	public static void TC02_ValidateAddToCartFunctionality() {
		BaseClass.getDriver().manage().deleteAllCookies();
		dp.DigitalDownloads.click();
		WebElement NightVisions = BaseClass.getDriver()
				.findElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'Night Visions')]"));
		NightVisions.click();
		String expectedPageTitle = "nopCommerce demo store. Night Visions";
		String actualPageTitle = BaseClass.getDriver().getTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);

		String nightVisionsUnitPrice = nvp.ItemPrice.getText();
		String itemQuantity = nvp.ItemQuantity.getAttribute("value");
		nvp.AddToCart.click();
		nvp.ShoppingCartIcon.click();

		String ActualPageTitle = scp.pageTitle.getText();
		String ExpectedPageTitle = "Shopping cart";
		Assert.assertEquals(ActualPageTitle, ExpectedPageTitle);

		String ActualShoppingCartItem = scp.shoppingCartItem.getText();
		String expectedShoppingCartItem = "Night Visions";
		Assert.assertEquals(expectedShoppingCartItem, ActualShoppingCartItem);

		String actualPrice = scp.price.getText();
		Assert.assertEquals(nightVisionsUnitPrice, actualPrice);

		String shoppingCartQuantity = scp.quantityTextBox.getAttribute("value");
		Assert.assertEquals(shoppingCartQuantity, itemQuantity);

		int quantity = Integer.parseInt(itemQuantity);
		float price = CommonMethods.PriceConverter(nightVisionsUnitPrice);
		float ExpectedTotal = quantity * price;
		String Total = scp.Total.getText();
		float ActualTotal = CommonMethods.PriceConverter(Total);
		Assert.assertEquals(ExpectedTotal, ActualTotal);

	}

	@Test(enabled = false)
	public static void TC03_ValidateUpdateQuantityFunctionality() {
		dp.DigitalDownloads.click();
		WebElement NightVisions = BaseClass.getDriver()
				.findElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'Night Visions')]"));
		NightVisions.click();
		String nightVisionsUnitPrice = nvp.ItemPrice.getText();
		nvp.AddToCart.click();
		nvp.ShoppingCartIcon.click();

		String ActualPageTitle = scp.pageTitle.getText();
		String ExpectedPageTitle = "Shopping cart";
		Assert.assertEquals(ActualPageTitle, ExpectedPageTitle);

		CommonMethods.sendText(scp.quantityTextBox, BaseClass.getProperty("updateQuantity"));
		scp.updateShoppingCart.click();
		String expectedQuanitity = BaseClass.getProperty("updateQuantity");
		String ActualQuantity = scp.quantityTextBox.getAttribute("value");
		Assert.assertEquals(expectedQuanitity, ActualQuantity);

		int quantity = Integer.parseInt(expectedQuanitity);
		System.out.println(quantity);
		float price = CommonMethods.PriceConverter(nightVisionsUnitPrice);
		System.out.println(price);
		float ExpectedTotal = quantity * price;
		String Total = scp.Total.getText();
		float ActualTotal = CommonMethods.PriceConverter(Total);
		Assert.assertEquals(ExpectedTotal, ActualTotal);
	}

}

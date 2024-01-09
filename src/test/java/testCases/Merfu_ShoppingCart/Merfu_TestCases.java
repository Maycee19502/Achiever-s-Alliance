package testCases.Merfu_ShoppingCart;

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
	@Test(enabled = true)
	public static void TC01_VerifyShoppingCartIcon() {
		BaseClass.getDriver().manage().deleteAllCookies();
		verifyURL();
		hardWait(3);
		Assert.assertTrue(dp.ShoppingCart.isDisplayed());

		dp.ShoppingCart.click();
		String actualMsg = BaseClass.getDriver().findElement(By.xpath("//*[@class='page-title']")).getText();
		String expectedMsg = "Shopping cart";
		Assert.assertEquals(actualMsg, expectedMsg);
	}

	@Test(enabled = false)
	public static void TC02_ValidateAddToCartFunctionality() {
		BaseClass.getDriver().manage().deleteAllCookies();
		verifyURL();
		dp.DigitalDownloads.click();
		WebElement NightVisions = BaseClass.getDriver()
				.findElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'Night Visions')]"));
		NightVisions.click();
		String expectedPageTitle =BaseClass.getProperty("expectedPageTitle");
		String actualPageTitle = BaseClass.getDriver().getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);

		String nightVisionsUnitPrice = nvp.ItemPrice.getText();
		String itemQuantity = nvp.ItemQuantity.getAttribute("value");
		nvp.AddToCart.click();
		nvp.ShoppingCartIcon.click();

		String actualPageTitle2 = scp.pageTitle.getText();
		String expectedPageTitle2 = BaseClass.getProperty("expectedPageTitle2");
		Assert.assertEquals(actualPageTitle2, expectedPageTitle2);

		String actualShoppingCartItem = scp.shoppingCartItem.getText();
		String expectedShoppingCartItem =BaseClass.getProperty("expectedShoppingCartItem");
		Assert.assertEquals(actualShoppingCartItem, expectedShoppingCartItem);

		String actualPrice = scp.price.getText();
		Assert.assertEquals(actualPrice, nightVisionsUnitPrice);

		String shoppingCartQuantity = scp.quantityTextBox.getAttribute("value");
		Assert.assertEquals(shoppingCartQuantity, itemQuantity);

		int quantity = Integer.parseInt(itemQuantity);
		float price = PriceConverter(nightVisionsUnitPrice);
		float expectedTotal = quantity * price;
		String Total = scp.Total.getText();
		float actualTotal = PriceConverter(Total);
		Assert.assertEquals(actualTotal, expectedTotal);

	}

	@Test(enabled = false)
	public static void TC03_ValidateUpdateQuantityFunctionality() {
		verifyURL();
		dp.DigitalDownloads.click();
		WebElement NightVisions = BaseClass.getDriver()
				.findElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'Night Visions')]"));
		NightVisions.click();
		String nightVisionsUnitPrice = nvp.ItemPrice.getText();
		nvp.AddToCart.click();
		nvp.ShoppingCartIcon.click();
		

		String actualPageTitle2 = scp.pageTitle.getText();
		String expectedPageTitle2 = BaseClass.getProperty("expectedPageTitle2");
		Assert.assertEquals(actualPageTitle2, expectedPageTitle2);

		CommonMethods.sendText(scp.quantityTextBox, BaseClass.getProperty("updateQuantity"));
		scp.updateShoppingCart.click();
		String expectedQuanitity = BaseClass.getProperty("updateQuantity");
		String actualQuantity = scp.quantityTextBox.getAttribute("value");
		Assert.assertEquals(actualQuantity, expectedQuanitity);

		int quantity = Integer.parseInt(expectedQuanitity);
		System.out.println(quantity);
		float price = PriceConverter(nightVisionsUnitPrice);
		System.out.println(price);
		float expectedTotal = quantity * price;
		String Total = scp.Total.getText();
		float actualTotal = PriceConverter(Total);
		Assert.assertEquals(actualTotal, expectedTotal);
	}

}

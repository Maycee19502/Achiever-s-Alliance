package testCases.AprilDiehl_ProductDetailPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC2_verifyProductComparisonFunctionality extends CommonMethods {

	@Test
	public void verifyProductComparisonFunctionality() {

		Actions actions = new Actions(BaseClass.getDriver());
		super.verifyURL();
		actions.moveToElement(dp.Electronics).build().perform();
		super.hardWait(3);
		dp.electronicsDropDownCellPhones.click();
		cell.HtcOneM8TextLink.click();
		cell.AddToCompareProductPage.click();
		cell.ProductComparisonPopupLink.click();

	}
}

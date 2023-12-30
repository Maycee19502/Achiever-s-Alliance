package testCases.AprilDiehl_ProductDetailPage;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class TC3_verifyDetailsOfProductOnProductPage extends CommonMethods {

	@Test

	public void verifyDetailsOfProductsPage() {
		
		super.verifyURL();
		Actions action = new Actions(BaseClass.getDriver());
		action.moveToElement(dp.Apparel).build().perform();
		super.hardWait(3);
		dp.ApparelDropDownShoes.click();
		shoe.adidasConsortiumCampus80s.click();
		shoe.selectSizeDropDown.click();
		shoe.size8.click();
		shoe.colorBlock.isDisplayed();
		shoe.priceBlock.isDisplayed();
		shoe.adidasConsortPrice.equals(BaseClass.getProperty("adidasConsortiumCampus"));

	}
}

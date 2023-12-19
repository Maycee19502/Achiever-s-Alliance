package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends PageInitializer {

	// this method is used for sending String(text) to the element we have given
	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);

	}

	// hard wait is being simplified here
	public static void hardWait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.getStackTrace();
		}
	}

	public static void clickOnTopBarMenu(List<WebElement> topMenu, String topMenuOption, List<WebElement> subMenu,
			String subMenuOption) {
		clickOnAdvancedMenuBar(topMenu, topMenuOption);
		if (subMenu != null) {
			clickOnAdvancedMenuBar(subMenu, subMenuOption);
		}
	}

	public static void clickOnAdvancedMenuBar(List<WebElement> leftMenuOptions, String menuItem) {
		List<WebElement> leftMainMenu = leftMenuOptions;
		for (WebElement MainMenu : leftMainMenu) {
			if (MainMenu.getText().contains(menuItem)) {
				MainMenu.click();
				break;
			}
		}
	}

	public static void clickRadioOrCheckboxByValue(List<WebElement> radioOrCheckbox, String value) {

		String actualValue;
		for (WebElement eachElement : radioOrCheckbox) {
			actualValue = eachElement.getAttribute("value").trim();

			if (eachElement.isEnabled() && actualValue.equals(value)) {
				eachElement.click();
				break;

			}
		}
	}

	public static void clickRadioOrCheckboxByText(List<WebElement> radioOrCheckbox, String value) {

		String actualValue;
		for (WebElement eachElement : radioOrCheckbox) {
			actualValue = eachElement.getText();

			if (eachElement.isEnabled() && actualValue.equals(value)) {
				eachElement.click();
				break;
			}
		}
	}

	public static void selectDropDownByVisibleText(WebElement element, String textToBeSelected) {

		Select select = new Select(element);

		List<WebElement> options = select.getOptions();

		for (WebElement eachOption : options) {
			if (eachOption.getText().equals(textToBeSelected)) {
				select.selectByVisibleText(textToBeSelected);
				break;

			}
		}
	}

//select dropdown value by index
	public static void selectDropDownIndex(WebElement element, int indexValue) {

		Select select = new Select(element);

		int optionSize = select.getOptions().size();

		if (optionSize > indexValue) {
			select.selectByIndex(indexValue);

		}
	}

	public static void acceptAlert() {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	public static void dismissAlert() {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static void getTextAlert() {
		String alertText = null;
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			alertText = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	public static void sendTextAlert(String text) {
		try {
			Alert alert = BaseClass.getDriver().switchTo().alert();
			alert.sendKeys(text);
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
	}

	public static void switchToIFrameByIndex(int iframeIndex) {
		try {
			BaseClass.getDriver().switchTo().frame(iframeIndex);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static void switchToIFrameByElement(WebElement element) {
		try {
			BaseClass.getDriver().switchTo().frame(element);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static void switchToIFrameByName(String iframeName) {
		try {
			BaseClass.getDriver().switchTo().frame(iframeName);

		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

	public static void switchToChildWindow(String parentWindowHandle) {
		try {
			// get all the window handles
			Set<String> windowHandles = BaseClass.getDriver().getWindowHandles();

			// switch to the child window

			for (String eachHandle : windowHandles) {
				if (!eachHandle.equals(parentWindowHandle)) {
					BaseClass.getDriver().switchTo().window(eachHandle);
					break;
				}
			}

		} catch (NoSuchWindowException e) {
			System.out.println("");
			e.printStackTrace();
		}
	}

//	WebDriverWait wait = new WebDriverWait(driver, 30);
//	
//	wait.until

	// this method declares webDriver wait
	public static WebDriverWait getWaitObject() {
		WebDriverWait wait = new WebDriverWait(BaseClass.getDriver(), Constants.exp_wait_time);
		return wait;
	}

//this method intitializes wait and take given action
	public static WebElement waitForClickability(WebElement element) {
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
	}

	public static WebElement waitForVisibility(WebElement element) {
		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
	}

	public static void click(WebElement element) {
		waitForVisibility(element).click();
	}

	public static void sendKey(WebElement element, String keys) {
		waitForVisibility(element).sendKeys(keys);
	}

	// action class

	public static void hoverOverMouse(WebElement element) {
		Actions action = new Actions(BaseClass.getDriver());
		action.moveToElement(element).build().perform();
	}

	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions action = new Actions(BaseClass.getDriver());
		action.dragAndDrop(sourceElement, targetElement).build().perform();
		;
	}

	public static void takeScreenShot(WebDriver driver) {

		// create object to SimpleDataFormat class and decide the format
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");
		// get the current date time with LocalDateTime
		LocalDateTime now = LocalDateTime.now();
		// convert the date into the string with the specified format
		String dateString = now.format(formatter);
		// casting webDriver to takescreenshot
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		// get the screenshot as an outputFile
		File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
		// define the destination path with the unique name
		String desFilePath = "src/test/resources/screenshots/Testing_" + dateString + ".png";
		File desFile = new File(desFilePath);
		// Use FileUtils to copy the screenshot to the dest
		try {
			FileUtils.copyFile(srcFile, desFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

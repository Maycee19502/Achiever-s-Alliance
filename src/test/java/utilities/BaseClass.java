package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashboardPage;
import pages.LoginPage;
import pages.RegisterPage;

public class BaseClass {

	// singleton class
	private static WebDriver driver;

	// Driver method

	@BeforeClass(alwaysRun = true)
	public static WebDriver getDriver() {
		if (driver == null) {
			switch (BaseClass.getProperty("browser")) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "safari":
				if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
					throw new WebDriverException("Your OS doesn't support Safari");
				}
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			case "edge":
				if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
					throw new WebDriverException("Your OS doesn't support Edge");
				}
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			}
			driver.get(BaseClass.getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Constants.imp_wait, TimeUnit.SECONDS);
			PageInitializer.initialize();
		}
		return driver;
	}

	RegisterPage rp = new RegisterPage();
	LoginPage lp = new LoginPage();
	DashboardPage dp = new DashboardPage();

	@BeforeMethod(alwaysRun = true)
	public void login() {
		lp.loginButton.click();
		lp.email.sendKeys(BaseClass.getProperty("email"));
		lp.password.sendKeys(BaseClass.getProperty("password"));
		lp.signInButton.click();

		try {
			if (lp.errorMessage.getText().contains("unsuccessful")) {
				lp.registerButton.click();
				rp.firstName.sendKeys(BaseClass.getProperty("firstName"));
				rp.lastName.sendKeys(BaseClass.getProperty("lastName"));
				rp.email.sendKeys(BaseClass.getProperty("email"));
				rp.password.sendKeys(BaseClass.getProperty("password"));
				rp.confirmPassword.sendKeys(BaseClass.getProperty("password"));
				rp.register.click();
				rp.continueButton.click();
				lp.loginButton.click();
				lp.email.sendKeys(BaseClass.getProperty("email"));
				lp.password.sendKeys(BaseClass.getProperty("password"));
				lp.signInButton.click();

			}
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}

		// "div[@class='message-error validation-summary-errors']'' error message xpath
		// Assert.assertEquals(dp.dashboardPageText.getText(), "Dashboard");
	}

	// @AfterMethod(alwaysRun = true)

	public void logOut() {

		dp.logoutButton.click();

	}

// driver tear down method
//	@AfterClass(alwaysRun = true)
	public static void tearDown() {
		if (BaseClass.getDriver() != null) {
			BaseClass.getDriver().close();
			BaseClass.getDriver().quit();

		}

	}

	// PropertiesReader

	private static Properties properties;

	static {
		try {
			// path to the file locaiton
			String filePath = Constants.propertiesFilePath;
			// open connection to the file
			FileInputStream fis = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(fis);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// this it the end of the static block

	public static String getProperty(String keyName) {
		return properties.getProperty(keyName);
	}

}

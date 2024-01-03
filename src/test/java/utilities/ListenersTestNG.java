package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import pages.DashboardPage;
import pages.LoginPage;

public class ListenersTestNG implements ITestListener {

	LoginPage lp = new LoginPage();
	DashboardPage dp = new DashboardPage();

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started" + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test successfully executed" + result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The test has failed");
		CommonMethods.takeScreenShot(BaseClass.getDriver());

		// logout on failure
		dp.logoutButton.click();
		// CommonMethods.clickOnMenuBar(dp.userNameMenuOptions,
		// BaseClass.getProperty("orangeHRM_userMenuOption4"));

		// log back in to prevent fail
//			lp.username.sendKeys(baseClass.getProperty("orangeHRM_Username"));
//			lp.password.sendKeys(baseClass.getProperty("orangeHRM_Password"));
//			lp.button.click();
//			Assert.assertEquals(dp.dashboardPageText.getText(), "Dashboard");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("on Start started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("on Finish Method");
	}

}

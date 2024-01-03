package testCases.frameworkTests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;
import utilities.ListenersTestNG;
import utilities.RetryAnalyzer;

@Listeners(ListenersTestNG.class)

public class test1 extends CommonMethods {

	// @Test(retryAnalyzer= RetryAnalyzer.class)
	public void addUser() {

		Assert.assertEquals(true, true);

	}

	@Test
	public void test2() {
		System.out.println("hello");
	}
}

//    //"div[@class='message-error validation-summary-errors']'' error message xpath
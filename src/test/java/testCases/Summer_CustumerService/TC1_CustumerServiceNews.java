package testCases.Summer_CustumerService;


import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class TC1_CustumerServiceNews extends CommonMethods {

	@Test
	public static void News() {

		verifyURL();
		hp.NewsLink.click();
		verifyAnyUrl("https://demo.nopcommerce.com/news");
		Assert.assertTrue(np.NewOline.isDisplayed(), "New Online Store is NOT Displayed");
		Assert.assertTrue(np.NewRelease.isDisplayed(), "New Release is NOT Displayed");
		Assert.assertTrue(np.About.isDisplayed(), "News About is NOT Displayed");
		
	}

}

//Verify the user is on the Homepage.
//2. Navigate to "News" button within the Customer Service 
//Section.
//3. Click on the "News" button.
//4.Verify the page redirection and ensure that the News page
//loads successfully.
//5. Verify that after clicking "News" button, it redirects to a new 
//page.
//6. Verify that all the news about the website shows up. 

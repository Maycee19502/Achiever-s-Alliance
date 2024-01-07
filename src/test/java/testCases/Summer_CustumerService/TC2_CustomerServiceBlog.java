package testCases.Summer_CustumerService;

import org.testng.annotations.Test;

import utilities.CommonMethods;

public class TC2_CustomerServiceBlog extends CommonMethods {

	@Test
	public static void Service() {

		verifyURL();
		hp.BlogLink.click();
		verifyAnyUrl("https://demo.nopcommerce.com/blog");

	}
}
//. Verify the user is on the Homepage.
//2. Navigate to "Blog" button within the Customer Service 
//Section.
//3. Click on the "Blog" button.
//4.Verify the page redirection and ensure that the Blog page
//loads successfully.
//5. Verify that after clicking "Blog" button, it redirects to a new 
//page.
//6. Verify that all the blogs about the website shows up. 
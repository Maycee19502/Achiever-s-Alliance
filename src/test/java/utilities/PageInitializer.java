package utilities;

import pages.CellPhonePage;
import pages.DashboardPage;
import pages.LoginPage;
import pages.NotebookPage;
import pages.RegisterPage;
import pages.ReviewPage;

public class PageInitializer extends BaseClass {

	public static RegisterPage rp;
	public static LoginPage lp;
	public static DashboardPage dp;
	public static ReviewPage review;
	public static NotebookPage notebook;
	public static CellPhonePage cell;
	
	public static void initialize() {

		rp = new RegisterPage();
		lp = new LoginPage();
		dp = new DashboardPage();
		review = new ReviewPage();
		notebook = new NotebookPage();
		cell = new CellPhonePage();
	}

}

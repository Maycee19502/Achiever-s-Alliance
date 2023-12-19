package utilities;


import pages.DashboardPage;
import pages.LoginPage;

public class PageInitializer extends BaseClass{

	public static LoginPage lp;
	public static DashboardPage dp;
	
	public static void initialize() {
		
		
		lp = new LoginPage();
		dp = new DashboardPage();
	}
	
	
}

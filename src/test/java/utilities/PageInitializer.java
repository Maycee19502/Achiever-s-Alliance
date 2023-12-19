package utilities;


import pages.DashboardPage;
import pages.LoginPage;
import pages.RegisterPage;

public class PageInitializer extends BaseClass{

	public static RegisterPage rp;
	public static LoginPage lp;
	public static DashboardPage dp;
	
	public static void initialize() {
		
		rp = new RegisterPage();
		lp = new LoginPage();
		dp = new DashboardPage();
	}
	
	
}

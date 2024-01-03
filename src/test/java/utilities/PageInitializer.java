package utilities;

import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterPage;

public class PageInitializer extends BaseClass {

	public static RegisterPage rp;
	public static LoginPage lp;
	public static DashboardPage dp;
	public static HomePage hp;

	public static void initialize() {

		rp = new RegisterPage();
		lp = new LoginPage();
		dp = new DashboardPage();
		hp = new HomePage();
	}

}

package utilities;


import pages.DashboardPage;
import pages.LoginPage;
import pages.NightVisionsProductPage;
import pages.RegisterPage;
import pages.shoppingCartPage;

public class PageInitializer extends BaseClass{

	public static RegisterPage rp;
	public static LoginPage lp;
	public static DashboardPage dp;
	public static NightVisionsProductPage nvp;
	public static shoppingCartPage scp;
	public static void initialize() {
		
		rp = new RegisterPage();
		lp = new LoginPage();
		dp = new DashboardPage();
		nvp=new NightVisionsProductPage();
		scp=new shoppingCartPage();
	}
	
	
}

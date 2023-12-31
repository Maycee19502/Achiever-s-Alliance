package utilities;


import pages.CellPhonePage;
import pages.DashboardPage;
import pages.HomePage;
import pages.LoginPage;
import pages.NightVisionsProductPage;
import pages.NotebookPage;
import pages.RegisterPage;
import pages.ReviewPage;
import pages.ShoesPage;
import pages.shoppingCartPage;

public class PageInitializer extends BaseClass{

	public static RegisterPage rp;
	public static LoginPage lp;
	public static DashboardPage dp;

	public static NightVisionsProductPage nvp;
	public static shoppingCartPage scp;
  
	public static ReviewPage review;
	public static NotebookPage notebook;
	public static HomePage hp;
	public static CellPhonePage cell;
	public static ShoesPage shoe;

	public static void initialize() {
		
		rp = new RegisterPage();
		lp = new LoginPage();
		dp = new DashboardPage();

		nvp = new NightVisionsProductPage();
		scp = new shoppingCartPage();
    
		review = new ReviewPage();
		notebook = new NotebookPage();
		hp = new HomePage();
		cell = new CellPhonePage();
		shoe = new ShoesPage();

	}
	
	
}

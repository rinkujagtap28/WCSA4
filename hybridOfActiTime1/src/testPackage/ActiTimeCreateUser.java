package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import genericPackage.BaseTest;
import genericPackage.Flib;
import pagePackage.HomePage;
import pagePackage.LoginPage;
import pagePackage.UsersPage;

public class ActiTimeCreateUser extends BaseTest {

	@Test
	public void createValidUser() throws InterruptedException, IOException
	{
	  LoginPage lp = new LoginPage(driver);	
	  Flib flib = new Flib();
	  lp.ActiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
	  Thread.sleep(2000);
	  HomePage hp = new HomePage(driver);
	  hp.ClickOnUser();
	
	  
	 
	}
}

package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.Logout;
import testBase.BaseClass;

public class TC003_LogoutTest extends BaseClass {
	@Test
	public void VerifyLogout() throws FileNotFoundException, IOException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.options();
		loginPage.optionLogin();
		loginPage.setUserName(properties.getProperty("userName"));
		loginPage.setPassword(properties.getProperty("password"));
		loginPage.clickLogin();	
		Logout logout = new Logout(driver);
		logout.options();
		logout.logout();
	}
}

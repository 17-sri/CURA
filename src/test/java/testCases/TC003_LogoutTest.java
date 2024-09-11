package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.Logout;
import testBase.BaseClass;

public class TC003_LogoutTest extends BaseClass {
	@Test
	public void VerifyLogout() throws FileNotFoundException, IOException {
		HomePage homePage = new HomePage(driver);
		homePage.clickMakeAppointment();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(properties.getProperty("userName"));
		loginPage.setPassword(properties.getProperty("password"));
		loginPage.clickLogin();		
		Logout logout = new Logout(driver);
		logout.options();
		logout.logout();
	}
}

package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass {
	@Test
	public void verify_login() {
		HomePage homePage = new HomePage(driver);
		homePage.clickMakeAppointment();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(properties.getProperty("userName"));
		loginPage.setPassword(properties.getProperty("password"));
		loginPage.clickLogin();
	}

}

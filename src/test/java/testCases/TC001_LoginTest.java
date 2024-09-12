package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass {
	@Test
	public void verify_login() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.options();
		loginPage.optionLogin();
		loginPage.setUserName(properties.getProperty("userName"));
		loginPage.setPassword(properties.getProperty("password"));
		loginPage.clickLogin();
	}
}
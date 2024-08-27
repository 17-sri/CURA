package testCases;

import org.testng.annotations.Test;

import pageObjects.Logout;
import testBase.BaseClass;

public class TC003_LogoutTest extends BaseClass {
	@Test
	public void VerifyLogout() {
		Logout logout = new Logout(driver);		
		logout.clickOptions();
		logout.clickLogout();
	}
}

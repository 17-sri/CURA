package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC003_LogoutTest extends BaseClass {
	@Test
	public void VerifyLogout() throws FileNotFoundException, IOException {
		login();
		logout();
	}
}
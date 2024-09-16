package testCases;

import org.testng.annotations.Test;

import testBase.BaseClass;

public class TC001_LoginTest extends BaseClass {
	@Test
	public void verify_login() {
		login(); // By baseClass
	}
}
package testNG;

import org.testng.annotations.Test;

/*
 * 1. opening application
 * 2. login to application
 * 3. logout from the application
 */

public class First_TestNG {
	@Test(priority=1)  // (priority=1) means prioritizing the the flow of execution(order of methods will not consider, only prioritize numbers are important)
	void openApp() {
		System.out.println("opening appliction");
	}
	@Test(priority=2)
	void loginApp() {
		System.out.println("login to appliction");

	}
	@Test(priority=3)
	void logoutApp() {
		System.out.println("logout from appliction");

	}
}

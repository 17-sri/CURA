package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import pageObjects.MakeAppointment;
import testBase.BaseClass;

public class TC002_MakeAppointmentTest extends BaseClass {
	@Test
	public void makeAppointment() throws IOException, IOException, Exception {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.options();
		loginPage.optionLogin();
		loginPage.setUserName(properties.getProperty("userName"));
		loginPage.setPassword(properties.getProperty("password"));
		loginPage.clickLogin();
		MakeAppointment makeAppointment = new MakeAppointment(driver);
		makeAppointment.setdropDown();
		makeAppointment.setRadioButton();
		makeAppointment.visitDate();
		makeAppointment.comment(randomString().toLowerCase());
		makeAppointment.bookAppointment();
		String confirmMessage = makeAppointment.getConfirmationMsg();
		Assert.assertEquals(confirmMessage, "Appointment Confirmation");
	}
}
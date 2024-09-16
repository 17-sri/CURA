package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.MakeAppointment;
import testBase.BaseClass;

public class TC002_MakeAppointmentTest extends BaseClass {
	@Test
	public void makeAppointment(){
		login();
		MakeAppointment makeAppointment = new MakeAppointment(driver);
		makeAppointment.setdropDown();
		makeAppointment.setRadioButton();
		makeAppointment.visitDate();
		makeAppointment.comment(randomString().toLowerCase());
		makeAppointment.bookAppointment();
		String confirmMessage = makeAppointment.getConfirmationMsg();
		Assert.assertEquals(confirmMessage, "Appointment Confirmation");
		logout();
	}
}
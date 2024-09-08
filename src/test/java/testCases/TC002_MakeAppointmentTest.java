package testCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MakeAppointment;
import testBase.BaseClass;

public class TC002_MakeAppointmentTest extends BaseClass {
	@SuppressWarnings("deprecation")
	@Test
	public void makeAppointment() throws IOException, IOException, Exception {
		HomePage homePage = new HomePage(driver);
		homePage.clickMakeAppointment();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(properties.getProperty("userName"));
		loginPage.setPassword(properties.getProperty("password"));
		loginPage.clickLogin();
		MakeAppointment makeAppointment = new MakeAppointment(driver);
		Properties properties = new Properties();
		properties.load(new FileReader("src/test/resources/config.properties"));
		String[] dropDownValues = properties.getProperty("dropDownValues").split(",");
		String randomValue = dropDownValues[new Random().nextInt(dropDownValues.length)];

		List<WebElement> radioButtons = makeAppointment.setRadiobtn();
		int count = radioButtons.size();
		int randomIndex = new Random().nextInt(count);
		radioButtons.get(randomIndex).click();
		System.out.println(randomIndex);
		
		makeAppointment.setdropDown(randomValue);
		//makeAppointment.setRadiobtn();
		makeAppointment.setvisitDate(tomorrowdate());
		makeAppointment.settxtComment(randomString().toLowerCase());
		makeAppointment.clickButton();
	}

}

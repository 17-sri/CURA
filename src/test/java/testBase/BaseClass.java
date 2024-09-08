package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pageObjects.MakeAppointment;

public class BaseClass {
	public static WebDriver driver;
	public Logger logger; // log4j2
	public Properties properties;
	MakeAppointment makeAppnt = new MakeAppointment(driver);
	

	@BeforeClass
	public void setUp() throws IOException {
		FileReader file = new FileReader(".//src//test//resources//config.properties");
		properties = new Properties();
		properties.load(file);
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(properties.getProperty("appURL"));
	}

	@AfterClass
	public void tearDown() {
		//driver.quit();
	}
	@AfterClass
	public void logout() {
		
	}
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(50);
		return generatedString;
	}
	public String tomorrowdate() {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String tomorrowDate = tomorrow.format(formatter);
        return tomorrowDate;
	}	
}
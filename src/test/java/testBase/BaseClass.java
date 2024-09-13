package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BaseClass {
	public static WebDriver driver;
	public Logger logger; // log4j2
	public Properties properties;
	//MakeAppointment makeAppnt = new MakeAppointment(driver);
	

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
		driver.quit();
	}
	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(50);
		return generatedString;
	}
	
	public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String filePath = System.getProperty("user.dir") + "//screenshots//" + testCaseName + timeStamp+ ".png";
		File file = new File(filePath);
		FileUtils.copyFile(source, file);
		return filePath;
	}

}
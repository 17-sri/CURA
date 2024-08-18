package popups;
import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class AvoidNotificationPopup {           
	@SuppressWarnings("deprecation") // this is just a warning from implicitlyWait
	public static void main(String[] args) throws InterruptedException, AWTException   {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeOptions options = new  ChromeOptions();
		options.addArguments("--disable-notifications");   //DISABLE THE POPUP
		options.addArguments("incognito");     // OPEN THE WINDOW IN INCOGNITO MODE
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		Thread.sleep(2000);
		System.out.println("success");
		driver.quit();
	}

}

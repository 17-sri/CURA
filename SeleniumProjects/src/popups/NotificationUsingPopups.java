package popups;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
public class NotificationUsingPopups {           
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception   {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);   //click TAB once
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);   //click TAB twice
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);   //click TAB thrice
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER); //click ENTER once
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);driver.quit();
		System.out.println("you just blocked notification from yatra.com");

	}

}

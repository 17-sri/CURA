package popups;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
public class WindowPopup {           
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception   {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);  //click hold Ctrl
		robot.keyPress(KeyEvent.VK_P);        //click P
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_P);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_TAB);      // click TAB once
		robot.keyRelease(KeyEvent.VK_TAB);Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);    // click ENTER once
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);driver.quit();
		System.out.println("success");

	}

}

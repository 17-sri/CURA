package popups;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ClearTrip_HiddenPopup {           
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:www.cleartrip.com/");
		driver.findElement(By.xpath("//*[name()='svg' and @class=' c-pointer c-neutral-900']")).click();
		/*
		 * this is usage of svg tag
		 *  //tagName[name()='svg'] should be compulsory
		 */
		Thread.sleep(2000);System.out.println("success");
		driver.quit();

	}

}

package popups;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class MakeMyTrip_HiddenPopup {           
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();  //cancelling popup
		Thread.sleep(2000);
		System.out.println("popup handled");
		driver.quit();
	}

}

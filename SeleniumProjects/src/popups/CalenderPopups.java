package popups;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class CalenderPopups {               //NO OUTPUT
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException   {
		String date ="Mon Aug 05 2024";
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/........");                  // NO OUTPUT
		driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();
		driver.findElement(By.xpath("//div[@area_lable='"+date+"']")).click();
		Thread.sleep(2000);
		driver.quit();
	
	
	}

}

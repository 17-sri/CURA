package popups;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class PopupsFileDownload {           
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://pixabay.com/photos/range-rover-car-vehicle-automobile-6613953/");
		driver.findElement(By.xpath("//span[text()='Download']")).click();Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='downloadItem--xBKyT']//span[text()='1920×3026']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='buttons--cqw3Y']//span[text()='Download']")).click();
		System.out.println("you just downloaded picture of range rover car"); Thread.sleep(2000);
		driver.quit();
		
	}

}

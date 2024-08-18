package popups;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class SendKeys {           
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//div[*]//a[text()='Alert with Textbox ']")).click();  //to select 'sendkeys' popups
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("I GOT THIS");
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);System.out.println("success");
		driver.quit();
	
	}

}

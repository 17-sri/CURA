package popups;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class ConfirmationPopups {           
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click(); //to select 'confirm'  popup
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());Thread.sleep(2000);
		alert.accept(); // to confirm
		Thread.sleep(2000);driver.quit();
		//alert.dismiss();
	}

}

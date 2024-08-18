package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Specifies the amount of time the driver should wait when searching for an element if it is not immediately present
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
		driver.findElement(By.xpath("//span[text()='SkillRary Admin']")).click();
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	    System.out.println("SIGNOUT SUCCESFUL	");
		
		Thread.sleep(2000);driver.quit();		
		
	}

}

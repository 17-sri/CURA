package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * 1. open application
 * 2. test logo is present
 * 3. login application
 * 4. logout
 */
public class OrangeHRM {
	WebDriver driver = new ChromeDriver();
	@Test(priority=0)
	void openApp() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test(priority=1)
	void testLogo() throws Exception {
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo is displayed ------>>>> it's "+status);
		
	}
	
	@Test(priority=2)
	void loginApp() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

		
	}
	@Test(priority=3)
	void logoutApp() {
		driver.quit();
		
	}
}

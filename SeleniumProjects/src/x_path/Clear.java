package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("srikanthv1709@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).clear(); // clear the textBox
		Thread.sleep(2000);driver.quit();
		System.out.println("textbox cleared");
		

	}

}

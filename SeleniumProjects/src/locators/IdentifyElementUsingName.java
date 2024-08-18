package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyElementUsingName {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.findElement(By.name("email")).sendKeys("srikanthv1709@gmail.com"); //using By.name 
		driver.findElement(By.name("password")).sendKeys("really don't know");
		System.out.println("success");
		driver.quit();
	}

}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyEelementUsingID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("srikanthv1709@gmail.com");  //using By.id
		System.out.println("success");
		driver.quit();
	}

}

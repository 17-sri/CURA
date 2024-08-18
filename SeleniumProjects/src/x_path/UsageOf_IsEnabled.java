package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOf_IsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		boolean flag = driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).isEnabled(); //Is the element currently enabled or not? 
		if(flag) {
			System.out.println("Enabled");
		}else {
			System.out.println("Disabled");
		}

	}

}

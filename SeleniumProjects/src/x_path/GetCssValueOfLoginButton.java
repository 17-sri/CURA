package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCssValueOfLoginButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		String fontFamily = driver.findElement(By.id("last")).getCssValue("font-family");  //Get the value of a given CSS property
		System.out.println("font family is      "+fontFamily);
		String buttonColor = driver.findElement(By.id("last")).getCssValue("color");
		System.out.println("login button color is     "+buttonColor);
		driver.quit();
	}

}

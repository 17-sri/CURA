package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextFromWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		String Text = driver.findElement(By.className("Forgot")).getText(); //Get the visible text of this element, including sub-elements
		System.out.println(Text);
		driver.quit();
	}

}

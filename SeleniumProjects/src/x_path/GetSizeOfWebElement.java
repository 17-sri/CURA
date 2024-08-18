package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeOfWebElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		Dimension dimensions = driver.findElement(By.id("myTab")).getSize();
		int tabHeight= dimensions.getHeight();  // returns height
		int tabWidth=dimensions.getWidth();   // returns width
		System.out.println("height is  "+tabHeight +" and  width is "+tabWidth);
		driver.quit();
	}

}

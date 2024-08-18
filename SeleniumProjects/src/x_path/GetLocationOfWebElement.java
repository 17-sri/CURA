package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationOfWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		WebElement ForgotField = driver.findElement(By.xpath("//a[@class='Forgot']"));
		int startX = ForgotField.getLocation().getX();  // X attribute
		int startY = ForgotField.getLocation().getY();  // Y attribute
		System.out.println("X-axis is "+startX +"\nY-axis is "+ startY);
		driver.quit();
	}

}

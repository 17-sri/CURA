package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangleElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		Rectangle emailTextField = driver.findElement(By.name("email")).getRect();
		int Height = emailTextField.getHeight(); //getting size
		int Width = emailTextField.getWidth();
		int startX = emailTextField.getX();  // getting location
		int startY = emailTextField.getY();
		System.out.println("Height is "+Height +" and Width is "+Width	);
		System.out.println("X-axis is  "+ startX +"  and Y-axis is  "+startY);
		driver.quit();
	}
}
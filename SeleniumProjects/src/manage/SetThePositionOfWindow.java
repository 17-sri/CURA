package manage;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetThePositionOfWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("hppts://www.google.com");
		Point point = new Point(100,77); //set the position of the window
		driver.manage().window().setPosition(point);
		System.out.println("success");
		driver.quit();

	}

}

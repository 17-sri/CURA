package manage;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetThePositionOfWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Point point = driver.manage().window().getPosition();//used to get the current position of the window
		int startX = point.getX();
		int startY = point.getY();
		System.out.println(startX);
		System.out.println(startY);
		driver.quit();
	}

}

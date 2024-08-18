package manage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheSizeOfWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Dimension dimension = driver.manage().window().getSize();
		int height =  dimension.getHeight();// it will the height of the window in integer value
		int width = dimension.getWidth();// it will return the width of the window in integer value 
		System.out.println("height is   "+height);
		System.out.println("width is    "+width);
		driver.quit();
		

	}

}

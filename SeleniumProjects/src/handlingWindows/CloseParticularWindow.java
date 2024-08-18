package handlingWindows;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParticularWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukari.com/");
		Set<String> allWindowIDS = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<String>(allWindowIDS);
		String secondWindowID = list.get(2);  
		driver.switchTo().window(secondWindowID); //closing second window
		driver.close();	
		
	}

}

package handlingWindows;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlyChildWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukari.com");
		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();
		allWindowID.remove(parentWindowID);
		for(String IDS:allWindowID) 
		{
			driver.switchTo().window(IDS);
			driver.close();
	    }
	}	
}

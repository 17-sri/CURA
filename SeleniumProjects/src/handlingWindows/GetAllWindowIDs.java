package handlingWindows;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllWindowIDs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set <String> windowIDS = driver.getWindowHandles(); // getting all windowIDs
		for(String ids:windowIDS) {
			System.out.println(ids);
		}
		driver.quit();
	}

}

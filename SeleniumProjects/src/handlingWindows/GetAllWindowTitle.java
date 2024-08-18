package handlingWindows;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllWindowTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set <String> windowIDS = driver.getWindowHandles();
		for(String ids : windowIDS) {
			driver.switchTo().window(ids);
			System.out.println(driver.getTitle());
		}driver.quit();
	}

}

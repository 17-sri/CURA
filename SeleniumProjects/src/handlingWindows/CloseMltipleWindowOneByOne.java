package handlingWindows;

import java.util.Set;       //don't know what's happening

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMltipleWindowOneByOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> windowIDS = driver.getWindowHandles();
		for(String ids:windowIDS) {
			driver.switchTo().window(ids);
			driver.close();
			
		}

	}

}

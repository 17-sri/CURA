package handlingWindows;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindowBasedOnTitle {

	public static void main(String[] args) {
		String expectedTitle = "Cognizant";
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		Set<String> windowIDS = driver.getWindowHandles();
		for(String IDS : windowIDS) {
			driver.switchTo().window(IDS);
			String actualTitle = driver.getTitle();
			if(expectedTitle.equals(actualTitle)) {
				driver.close();   // i think no output
				break;
			}
		}
	}
}
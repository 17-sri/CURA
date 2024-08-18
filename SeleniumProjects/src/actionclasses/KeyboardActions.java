package actionclasses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery.com/");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();  //pageDown
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_UP).perform();    //pageUp
		Thread.sleep(2000);driver.quit();
		System.out.println("page_down and page_up succesflly");
	}

}

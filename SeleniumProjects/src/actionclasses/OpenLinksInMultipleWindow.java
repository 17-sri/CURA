package actionclasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinksInMultipleWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com");
		List<WebElement> navBar = driver.findElements(By.id("live-scores-link"));   //remember it is driver.findElements
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL);
		for(WebElement element:navBar) {
			action.click(element);
		}action.keyUp(Keys.CONTROL);
		action.perform();
		System.out.println("success");
	}

}

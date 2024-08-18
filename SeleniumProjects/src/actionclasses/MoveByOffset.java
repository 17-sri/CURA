package actionclasses;

import org.openqa.selenium.chrome.ChromeDriver;    
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
        Actions action = new Actions(driver);
        action.moveByOffset(240, 40).click().perform(); //mouseHover by specific x,y attributes
        Thread.sleep(2000);driver.quit();
        System.out.println("mouse hovered by offset");
	}

}

package actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
        WebElement men = driver.findElement(By.xpath("//a[@class='desktop-main']"));
        Actions action = new Actions(driver);
        action.moveToElement(men).perform(); //move mouse to specific WebElement
        Thread.sleep(5000);driver.quit();
        System.out.println("mouse hovered");
	}

}

package actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickWebElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClickButton = driver.findElement(By.xpath("//button"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClickButton).perform(); // performing doubleclick using action class
		Thread.sleep(2000);driver.quit();
		System.out.println("double clicked succesfully");

	}

}

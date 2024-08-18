package actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;    ////NO OUTPUT
import org.openqa.selenium.interactions.Actions;

public class MoveMouseOnTheElement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
        WebElement men = driver.findElement(By.xpath("//div[@class='_1wE2Px']"));
        Actions action = new Actions(driver);
        action.moveToElement(men, 1186, 117).perform();
        Thread.sleep(5000);driver.quit();
	}

}

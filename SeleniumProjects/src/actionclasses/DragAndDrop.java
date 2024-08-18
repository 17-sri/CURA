package actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(2000);
		/*
		 * this is to page down, because we should scroll to see WebElement 
		 */
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		/*
		 * This is to drag and drop
		 */
		WebElement source1 = driver.findElement(By.xpath("//img[@id='angular']"));  // dragged WebElement from here
		WebElement destination1 = driver.findElement(By.id("droparea"));            // dropped here   
		Actions action1 = new Actions(driver);
		action1.dragAndDrop(source1, destination1).perform();  //using action class we do drag and drop
		Thread.sleep(3000);
		driver.quit();System.out.println("succesful");
	}

}

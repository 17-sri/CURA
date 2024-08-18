package actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByCo_Ordinates {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		/*
		 * accessing frame, because required WebElement present inside frame
		 * we cannot access directly, so
		 * first we switch driver control inside frame, then we search for WebElement 
		 */
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);  //switching driver control to frame
		WebElement box = driver.findElement(By.xpath("//div[@id='draggable']"));
		Actions action = new Actions(driver);Thread.sleep(2000);
		action.dragAndDropBy(box, 200, 0).perform();
		driver.switchTo().defaultContent();  //switch driver to main page
		Thread.sleep(2000);
		System.out.println("success");
		driver.quit();
		
	}

}

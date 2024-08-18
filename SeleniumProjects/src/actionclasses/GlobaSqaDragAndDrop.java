package actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GlobaSqaDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);  //switchTo frame
		WebElement source = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement destination = driver.findElement(By.xpath("//div[@class='ui-widget-content ui-state-default ui-droppable']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();  //image drag and drop
		Thread.sleep(2000);driver.quit();
		System.out.println("dragged and dropped succesfully ");
	}

}

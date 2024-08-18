package actionclassusing_javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOndisabledButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dofactory.com/html/button/disabled");
		/*
		 * It is also example of scroll element to visible area
		 * scroll element to visible area
		 */
		WebElement element = driver.findElement(By.xpath("//h3[text()='Example']"));  
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("arguments[0].scrollIntoView(true);", element); 	//scroll element to visible area
		Thread.sleep(2000);	
		/*
		 * Click on the disabled button
		 */
		WebElement disabledButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
		js.executeScript("arguments[0].removeAttribute('disabled')", disabledButton); // removing 'disabled' attribute
		disabledButton.click();Thread.sleep(2000);
		js.executeScript("arguments[0].click()", disabledButton); //click
		Thread.sleep(2000);driver.quit();
	}

}

package popups;

import java.util.Set;       //THIS IS CHATGPT PROGRAM(RE-ORGANIGED)

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LicPopup {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe"); // Set the path to your WebDriver executable     
		ChromeDriver driver = new ChromeDriver(); // Initialize the WebDriver
		driver.manage().window().maximize();
		driver.get("https://licindia.in/"); // Open the initial webPage       
		String parentHandle = driver.getWindowHandle(); // Store the current window handle
		driver.findElement(By.xpath("//a[text()=' Pay Premium ']")).click();  // Find and click the link to open a new tab
		Alert alert = driver.switchTo().alert();  //confirmation popup to open new tab
		alert.accept(); //accepting popup
		// Wait for the new tab to open
		Thread.sleep(2000); // Simple wait to allow new tab to open; replace with WebDriverWait in real scenarios     
		Set<String> handles = driver.getWindowHandles();  // Get all window handles        
		for (String handle : handles) {  // Switch to the new tab by comparing handles
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				break;
			}
		}        
		System.out.println("Current URL in new tab: " + driver.getCurrentUrl()); // Perform actions on the new tab
		System.out.println("Title of the new tab: " + driver.getTitle());
		driver.switchTo().window(parentHandle);   // Switch back to the original tab
		System.out.println("Current URL in original tab: " + driver.getCurrentUrl());      
		driver.quit();  // Close the browser
	}
}

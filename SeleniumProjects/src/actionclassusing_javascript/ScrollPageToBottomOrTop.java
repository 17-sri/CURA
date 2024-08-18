package actionclassusing_javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageToBottomOrTop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.crickbuzz.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); //  scroll to bottom
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)"); //scroll to top
		Thread.sleep(3000);
		js.executeScript("history.go(0)");driver.quit();
		
	}

}

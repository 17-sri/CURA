package handlingWindows;

import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureCurrentWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);  // printing unique windowID
		driver.quit();
	}

}

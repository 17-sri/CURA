package manage;

import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizeTheWindow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("hppts://www.google.com");
		driver.manage().window().maximize();//used to maximize the window
		driver.manage().window().fullscreen();//used to open the window in the fullScreen mode
		Thread.sleep(2000);driver.quit();
	}

}

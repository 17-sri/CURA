package webdriverMethds;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetPagesource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com");
		String actualPageSourceCode = driver.getPageSource();//used to get the source code of the current webPage
		System.out.println(actualPageSourceCode);
		driver.quit();
	}
}

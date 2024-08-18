package webdriverMethds;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.google.com");
		driver.navigate().forward();//it will navigate to the next page
		driver.navigate().back();//it will navigate to the previous page
		driver.navigate().refresh();//it will refresh the webPage
		driver.navigate().to("https://google.com");// it will navigate to the particular URL		

	}

}

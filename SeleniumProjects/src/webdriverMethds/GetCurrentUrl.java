package webdriverMethds;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		
		System.out.println(driver.getCurrentUrl());   //used to get the URL of the current webPage opened through selenium session
		driver.close();// used to close current window		
	}
}


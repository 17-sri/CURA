package webdriverMethds;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetString {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\chromedriver.exe" );
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com");//used to navigate the main URL of the webPage
		driver.quit();// used to quit all the windows opened through selenium session
		}

}

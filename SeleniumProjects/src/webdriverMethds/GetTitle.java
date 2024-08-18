
package webdriverMethds;

import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String expectedTitle ="Gmail";
		driver.get("https://mail.google.com");
		String actualTitle = driver.getTitle();//used to get the title of the webPage
		System.out.println("actual pageTitle is     "+actualTitle);
		if(expectedTitle.equals(actualTitle)){
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}driver.quit();			
	}

}
package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		String expectedText = "keepLoggedInCheckBox";
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		String actualText = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("name"); //returns attribute of 'name'
		System.out.println("expected text is	"+expectedText);
		System.out.println("actual text is		"+actualText);
		if(expectedText.equals(actualText)) {
			System.out.println("passed :  test case is verified");
		}else {
			System.out.println("failed : test case is failed");
		}driver.quit();
			
		
	}

}

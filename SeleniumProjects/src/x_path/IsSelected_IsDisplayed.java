package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();
		Thread.sleep(2000);
		boolean flag1 = checkBox.isDisplayed(); //Is this element displayed or not? 
		boolean flag2 = checkBox.isSelected();  //Determine whether this element is selected or not
		if(flag1&&flag2) {
			System.out.println("test case passed");
		}else {
			System.out.println("test case failed");
		}Thread.sleep(2000);
		driver.quit();		
	}
}

package x_path;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeysUsage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		WebElement uNameTextField=driver.findElement(By.id("email"));
		uNameTextField.sendKeys("admin");
		WebElement pwdTextField=driver.findElement(By.id("password"));
		pwdTextField.sendKeys("admin");
		pwdTextField.sendKeys(Keys.TAB);//to go to "Keep me logged in"
		pwdTextField.sendKeys(Keys.TAB);//to go to "Forgot your password?"
		pwdTextField.sendKeys(Keys.TAB);//to go to "LogIn Button"
		driver.findElement(By.id("last")).sendKeys(Keys.ENTER);// to click on LogIn Button using sendKeys
		System.out.println("successful");
		driver.quit();

	}

}

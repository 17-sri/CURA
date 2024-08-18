package actionclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement dropDown = driver.findElement(By.xpath("//select"));
		Select select = new Select(dropDown); // accessing dropDown using select class
		boolean flag = select.isMultiple();
		if(flag) {
			System.out.println("It is multiselect dropdown");
		}else {
			System.out.println("It is single select dropdown");
		}driver.quit();

	}

}

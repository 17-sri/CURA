package x_path;

import java.util.List;//NO OUTPUT

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetFifaCountryNames {                       //NO OUTPUT

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fifa.com/en/world-rankings");
		
		//Alert alert = driver.switchTo().alert();alert.accept();Thread.sleep(2000);
		
		WebElement viewTable = driver.findElement(By.xpath("//div[text()='Team']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewTable);
		Thread.sleep(2000);
		
		List<WebElement> countryNames = driver.findElements(By.xpath("//div[*]//div[@class='data-grid-module_header__E8rbS fcds-dataGrid-title']//table[@class='table-module_table__76hUL fcds-table']//span[@class='team-cell_teamCode__k4uxK']"));
		for(WebElement names:countryNames) {
			System.out.println(names.getText());
		
		}//driver.quit();

	}

}
// 	NO OUTPUT
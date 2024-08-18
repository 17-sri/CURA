package actionclasses;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {       //              NO OUTPUT

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ej2.syncfusion.com/demos/multi-select/default/");
		
		/*
		 * scroll element to visible area
		 
		WebElement element = driver.findElement(By.xpath("//h1[@class='kd-title']"));  
		JavascriptExecutor js = (JavascriptExecutor)driver;  
		js.executeScript("arguments[0].scrollIntoView(true);", element); 	
		Thread.sleep(2000);	
		
		 * multiselect dropdown
		 */
		driver.findElement(By.xpath("//div[@class='control-styles'][1]//div[@class='e-multiselect e-input-group e-control-wrapper']//select[@id='default']")).click();
		WebElement dropDown = driver.findElement(By.xpath("//div[@class='control-styles'][1]//div[@class='e-multiselect e-input-group e-control-wrapper']//select[@id='default']"));
		Select select =  new Select(dropDown);
		//select.selectByIndex(2);
		select.selectByValue("Game1");
		select.selectByVisibleText("Cricket");
		//WebElement firstElement = select.getFirstSelectedOption();
		//System.out.println(firstElement);
		List<WebElement> allElements = select.getAllSelectedOptions();
		for(WebElement option:allElements) {
			System.out.println(option.getText());
		}select.deselectAll();
		Thread.sleep(2000);driver.quit();          //NO OUTPUT
	}

}

package handlingWindows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleInAscendDiscend {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		Set<String> allWindowIDS = driver.getWindowHandles();
		ArrayList<String> list =  new ArrayList<>();
		for(String IDS : allWindowIDS ) {
			driver.switchTo().window(IDS);
			list.add(driver.getTitle());
		}
		System.out.println(list);
		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder()); //  for reverse order
		for(String title:list) {
			System.out.println(title);
		}
		driver.quit();                      //NO PROPER OUTPUT
	}

}

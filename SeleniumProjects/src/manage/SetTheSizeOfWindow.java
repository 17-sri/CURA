package manage;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetTheSizeOfWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Dimension dimension = new Dimension(555,777);/* creation of the of the Dimension class and 
		pass the dimension in the constructor of the Dimension class */
		driver.manage().window().setSize(dimension);// used to set the dimension of the window
		System.out.println("success");
		driver.quit();
	}

}

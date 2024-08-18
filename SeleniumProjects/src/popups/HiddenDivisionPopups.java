package popups;
import org.openqa.selenium.By;   //	WEBSITE REORGANIZED
import org.openqa.selenium.chrome.ChromeDriver;    //NO OUTPUT
public class HiddenDivisionPopups {           
	public static void main(String[] args) throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https:www.flipkart.com");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']")).sendKeys("srikanthv1709@gmail.com");
		//driver.findElement(By.xpath("//input[@class='']")).sendKeys("Don't know");
		//driver.findElement(By.xpath("//button[@class='_1wGnMD rX1XT4 _2nD2xJ']")).click();
		Thread.sleep(2000);driver.quit();
		  //NO OUTPUT
	}

}

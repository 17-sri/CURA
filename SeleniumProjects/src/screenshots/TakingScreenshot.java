package screenshots;
import java.io.File;				 //for entire page screenshot
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
public class TakingScreenshot {                    
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		String timeStamp = LocalDateTime.now().toString().replace("-", "_").replace(":", "_").replace(".", "_");
		System.out.println("screenShotName is   "+timeStamp+".png");		
		File screenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);   // entire webPage screenshot
		FileUtils.copyFile(screenshotFile, new File("C:/selenium/screenshots/"+timeStamp+".png"));
		Thread.sleep(2000);driver.quit();
	}

}

package screenshots;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenshotOfFacebook {           // only one webElement screenshot
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		String timeStamp = LocalDateTime.now().toString().replace("-", "_").replace(":", "_").replace(".", "_");
		System.out.println("screenShotName is   "+timeStamp+".png"); //naming screenshot as timeStamp.png
		File screenshotFile = driver.findElement(By.xpath("//img[@class='_97vu img']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:/selenium/screenshots/"+timeStamp+".png"));	// giving filePath
		Thread.sleep(2000);driver.quit();

	}

}

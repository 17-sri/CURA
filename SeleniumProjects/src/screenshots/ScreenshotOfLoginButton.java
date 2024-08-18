package screenshots;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenshotOfLoginButton {           // only Login Button screenshot
	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		String timeStamp = LocalDateTime.now().toString().replace("-", "_").replace(":", "_").replace(".", "_");
		System.out.println("screenShotName is   "+timeStamp+".png");  //naming screenshot as timeStamp.png
		File screenshotFile=driver.findElement(By.xpath("//button[@class='login_Btn']")).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotFile, new File("C:/selenium/screenshots/"+timeStamp+".png"));  // giving filePath
		Thread.sleep(2000);driver.quit();
	}
	/* or use this instead line 18
	 * File destinationFile= new File("C:/Selenium/screenshots/"+timeStamp+".png");
	 * FileUtils.copyFile(screenshotFile, destinationFile);	
	*/
	/* or use this instead line 18
	 * File destinationFile= new File("C:/Selenium/screenshots/"+timeStamp+".png");
	 * screenshotFile.renameTo(destinationFile);
	*/

}

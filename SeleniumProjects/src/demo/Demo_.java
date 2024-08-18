package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class Demo_ {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        /*
         * this is to scroll the page to the particular position
         */
        WebElement element = driver.findElement(By.xpath("//div[@class='header-text' and text()='Widgets']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();

        // Open new child window within the main window
        driver.findElement(By.id("windowButton")).click();
        //open a window message
        driver.findElement(By.xpath("//button[text()='New Window Message']")).click();

        //Get handles of the windows
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();

        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));  //child window webelelement
                System.out.println("Heading of child window is  ---->>>> " + text.getText());
            }
        }
    }
}
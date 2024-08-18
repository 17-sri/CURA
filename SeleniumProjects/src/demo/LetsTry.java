package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LetsTry {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/selenium/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.live.com/oauth20_authorize.srf?client_id=4b3e8f46-56d3-427f-b1e2-d239b2ea6bca&scope=openId+profile+openid+offline_access&redirect_uri=https%3a%2f%2fteams.live.com%2fv2&response_type=code&state=eyJpZCI6ImFlMjZmODk5LTlhN2MtNDNmZC05OTg2LWQxNzVhZmI0MzNjNSIsIm1ldGEiOnsiaW50ZXJhY3Rpb25UeXBlIjoicmVkaXJlY3QifX0%3d&response_mode=fragment&nonce=61a37ab0-2c86-469a-af46-bd462c5c217e&prompt=select_account&code_challenge=eGFVQ_64rs4ucPH8X2cDp97wFRxcz6uPm1_kkt-lP34&code_challenge_method=S256&x-client-SKU=msal.js.browser&x-client-Ver=3.7.1&uaid=808c61460e8245eaa5214f55da2aa1da&msproxy=1&issuer=mso&tenant=consumers&ui_locales=en-US&client_info=1&epct=PAQABDgEAAAApTwJmzXqdR4BN2miheQMYLSWnsgKjP47sBp0AuszJzmWxBgQVYPA1B95uqo7Qj2I6QZ4xIqQ3vsvFJMPpb8GFw-V6xa2DDcr9YtPTAY1N5g9P8326yQHg7me4D2fgH__UMrOjketXjjK81GhI2ZwPt0NMHshE1Taa7nGRzr6o2GftCflXMlRviOo5S-Dq-X3llGJbvhUunNiJNN6dGS1o1kjBWjr8lWU2tS4y9JnhnCAA&jshs=0#");
		driver.findElement(By.id("i0116")).sendKeys("srikanthsriv555@gmail.com");
		driver.findElement(By.xpath("//div[@class='ext-button-item ___frx9oy0 f14t3ns0']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("i0118")).sendKeys("Joker@143");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='No']")).click();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_ALT);
		//driver.findElement(By.xpath("//button[@class='fui-Button r1alrhcs ___2x0eoq0 f1c21dwh f1p3nwhy f11589ue f1q5o8ev f1pdflbu fkfq4zb fjxutwb f1s2uweq fr80ssc f1ukrpxl fecsdlb f139oj5f ft1hn21 fuxngvv fwiml72 f1h0usnq fs4ktlq f16h9ulv fx2bmrt f1fg1p5m f1dfjoow f1j98vj9 f1tme0vf f4xjyn1 f18onu3q f9ddjv3 f17fgpbq f1sl3k7w f136y8j8 f1brlhvm f10xn8zz f1aa9q02 f16jpd5f f1jar5jt fyu767a fy9rknc figsok6 fwrc4pm fg3gtdo fwii5mg f1palphq f12nxie7 f1jt17bm']")).click();
		//driver.findElement(By.xpath("//div[text()='Srikanth V']")).click();
		//driver.findElement(By.xpath("//button[@class='fui-Button r1alrhcs ___1raoggt fjp48h0 f1p3nwhy f11589ue f1q5o8ev f1pdflbu fkfq4zb fzpis3h f1s2uweq fr80ssc f1ukrpxl fecsdlb f139oj5f ft1hn21 fuxngvv fgtedwr f1h0usnq fs4ktlq f16h9ulv fx2bmrt f1fg1p5m f1dfjoow f1j98vj9 f1tme0vf f4xjyn1 f18onu3q f9ddjv3 f1nbblvp fifp7yv f1ov4xf1 f1asdtw4 fwbmr0d fheyfof f1rqyxcv f8zmjen f475ppk fjf1xye f1szoe96 f1d2rq10 fnivh3a fc7yr5o f1el4m67 f8yange f1iw27ad f1yog68k f1uc2dka f10yh9m7 f4fr5yb f1v8l80c'][3]")).click();
		//driver.findElement(By.xpath("//div[@class='ui-box j']")).sendKeys("srikanthv1709@gmail.com");
		
		

	}

}

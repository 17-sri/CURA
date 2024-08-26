package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//input[@id='txt-username']")
	WebElement txtUserName;
	@FindBy(xpath = "//input[@id='txt-password']")
	WebElement txtPassword;
	@FindBy(xpath = "//button[@id='btn-login']")
	WebElement btnLogin;
	
	public void setUserName(String uName) {
		txtUserName.sendKeys(uName);
	}
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}
	public void clickLogin() {
		btnLogin.click();
	}

}

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = ".fa.fa-bars")
	WebElement btnOptions;
	@FindBy(xpath = "//a[text()='Login']")
	WebElement optionlogin;
	@FindBy(xpath = "//input[@id='txt-username']")
	WebElement txtUserName;
	@FindBy(xpath = "//input[@id='txt-password']")
	WebElement txtPassword;
	@FindBy(xpath = "//button[@id='btn-login']")
	WebElement btnLogin;
	public void options() {
		btnOptions.click();
	}
	public void optionLogin() {
		optionlogin.click();
	}
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

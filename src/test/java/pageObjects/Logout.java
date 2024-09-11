package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage  {

	public Logout(WebDriver driver) {
		super(driver);
	}
	@FindBy(css = ".fa.fa-bars")
	WebElement btnOptions;
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement btnLogout;
	public void options() {
		btnOptions.click();
	}
	public void logout() {
		btnLogout.click();
	}
}

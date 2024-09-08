package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage {

	public Logout(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//i[@class='fa fa-bars']")
	WebElement btnOptions;
	@FindBy(xpath = "//a[normalize-space()='Logout']")
	WebElement btnLogout;
	
	public void clickOptions() {
		btnOptions.click();
	}
	public void clickLogout() {
		btnLogout.click();
	}

}

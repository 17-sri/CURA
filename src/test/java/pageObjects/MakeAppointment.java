package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointment extends BasePage{

	public MakeAppointment(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "(//select[@id='combo_facility'])[1]")
	WebElement dropDown;
	@FindBy(xpath = "(//div[@class='col-sm-4'])[2]")
	List<WebElement> radiobtn_HealthCareProgram;
	@FindBy(xpath = "//input[@id='txt_visit_date']")
	WebElement visitDate;
	@FindBy(xpath = "//textarea[@id='txt_comment']")
	WebElement txtComment;
	@FindBy(xpath = "//button[@id='btn-book-appointment']")
	WebElement btnBookAppointment;
	public void setdropDown(String dD) {
		Select select = new Select(dropDown);
        select.selectByVisibleText(dD);
	}
	public List<WebElement> setRadiobtn () {
		return radiobtn_HealthCareProgram;	
	}
	public void setvisitDate(String date) {
		visitDate.sendKeys(date);
	}
	public void settxtComment(String cmt) {
		txtComment.sendKeys(cmt);
	}
	public void clickButton() {
		btnBookAppointment.click();
	}
	
}
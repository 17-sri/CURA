package pageObjects;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class MakeAppointment extends BasePage {

	public MakeAppointment(WebDriver driver) {
		super(driver);
	}

	By dropDownLocator = By.cssSelector("#combo_facility");
	By radioButtonLocator = By.xpath("(//div[@class='col-sm-4'])[2]");
	@FindBy(css = "#txt_visit_date")
	WebElement txtVisitDate;
	@FindBy(css = "#txt_comment")
	WebElement txtComment;
	@FindBy(css = "#btn-book-appointment")
	WebElement btnAppointment;
	@FindBy(xpath = "//h2[text()='Appointment Confirmation']")
	WebElement msgConfirmation;
	
	public void setdropDown() {
		WebElement dropDowmElement = driver.findElement(dropDownLocator);
		Select dropDown = new Select(dropDowmElement);
		List<WebElement> options = dropDown.getOptions();
		Random random = new Random();
	    int randomIndex = random.nextInt(options.size());
	    dropDown.selectByIndex(randomIndex);
	}
	public List<WebElement> getRadioButtons() {
        return driver.findElements(radioButtonLocator);
    }
	public void setRadioButton() {
		 List<WebElement> radioButtons = getRadioButtons();
		 Random random = new Random();
	     int index = random.nextInt(radioButtons.size());
	     radioButtons.get(index).click();
	}
	public LocalDate getTomorrowDate() {
        return LocalDate.now().plusDays(1);
    }
	public String tomorrowdate() {
		LocalDate tomorrow = LocalDate.now().plusDays(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        String tomorrowDate = tomorrow.format(formatter);
        return tomorrowDate;
	}
	public void visitDate() {
		 String tomorrowDate = tomorrowdate();
		 txtVisitDate.sendKeys(tomorrowDate); 
	}
	public void comment(String cmnt) {
		txtComment.sendKeys(cmnt);
	}
	public void bookAppointment() {
		btnAppointment.click();
	}
	public String getConfirmationMsg() {
		try {
			return(msgConfirmation.getText());
		}catch(Exception e) {
			return(e.getMessage());
		}
	}
}
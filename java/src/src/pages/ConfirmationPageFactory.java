package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPageFactory {
	WebDriver driver;
	
	// Defining Web Elements at Class Level
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]")
	WebElement confElement;
	
	
	
	public void printConfirmation() {
		System.out.println("CONFIRMATION: " + confElement.getText());
	}
	
	
	
	public ConfirmationPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPageFactory {
	
	WebDriver driver;
	
	// Defining Web Element at Class Level
	@FindBy(linkText = "Logout")
	WebElement logoutButton;
	
	
	public void logout() {
		logoutButton.click();
	}
	
	public LogoutPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

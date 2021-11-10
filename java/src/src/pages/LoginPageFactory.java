package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPageFactory {
	
	WebDriver driver;
	
	// Defining Web Elements at Class Level
	@FindBy(id = "username")
	WebElement usernameBox;
	
	@FindBy(id = "password")
	WebElement passwordBox;
	
	@FindBy(className = "radius")
	WebElement loginButton;
	
	
	//Steps
	public void setUsername(String username) {
		usernameBox.sendKeys(username);
	}
	
	public void setPassword(String password) {
		passwordBox.sendKeys(password);
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	
	// Complete Login Functionality
	// We only need call this method for complete Login Testing.
	public void login(String username, String password) {
		setUsername(username);
		setPassword(password);
		clickLogin();
	}
	
	
	//Constructor initializes the state of the driver
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		
		//Initializes Web Element
		PageFactory.initElements(driver, this);
	}
	
}
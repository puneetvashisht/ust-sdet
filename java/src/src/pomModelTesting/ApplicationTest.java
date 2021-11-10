package pomModelTesting;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pages.ConfirmationPageFactory;
import pages.LoginPageFactory;
import pages.LogoutPageFactory;

public class ApplicationTest {
	
	@Test
	public void applicationTestPOM() {
		WebDriver driver = utilitypackage.DriverFactory.open("firefox");
		driver.get("https://the-internet.herokuapp.com/login");
		
		String username  = "tomsmith";
		String password  = "SuperSecretPassword!";
		
		//Enter Login Information(Login Page)
		LoginPageFactory loginPage = new LoginPageFactory(driver);
		loginPage.login(username, password);
		
		
		
		//Logging Out (Logout Page)
		LogoutPageFactory logoutPage = new LogoutPageFactory(driver);
		logoutPage.logout();
		
		
		
		//Getting the Confirmation (Confirmation Page)
		ConfirmationPageFactory confirmationPage = new ConfirmationPageFactory(driver);
		confirmationPage.printConfirmation();
		
		driver.close();
	}
}

package utilitypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	
	public static WebDriver open(String browserType) {
		
		if(browserType.equalsIgnoreCase("firefox")) {
			return new FirefoxDriver();
		}
		else if(browserType.equalsIgnoreCase("IE")) {
			return new InternetExplorerDriver();
		}
		else {
			return new ChromeDriver();
		}
		
	}

}

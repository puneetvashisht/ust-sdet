package stepsImplementation;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDDLoginTest {
	
	WebDriver driver;

	 @Given("^User is on the login page$")
	 public void userlogin() {
		 driver = new ChromeDriver();
//		 utilitypackage.DriverFactory.open("chrome");
		 driver.get("https://the-internet.herokuapp.com/login");
	 }
	 @When("^User enters correct username and password$")
	 public void userloginAction() {
//		 driver = new ChromeDriver();
		 String username = "tomsmith";
			String password = "SuperSecretPassword!";
		 WebElement userNameElement = driver
					.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
			WebElement passwordElement = driver.findElement(By.cssSelector("input[id ='password']"));
			WebElement loginElement = driver.findElement(By.className("radius"));

			userNameElement.sendKeys(username);
			passwordElement.sendKeys(password);

			loginElement.click();
	 }
	 @When("^User enters incorrect username$")
	 public void wrongloginAction() {
//		 driver = new ChromeDriver();
		 String username = "wrong";
			String password = "SuperSecretPassword!";
		 WebElement userNameElement = driver
					.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
			WebElement passwordElement = driver.findElement(By.cssSelector("input[id ='password']"));
			WebElement loginElement = driver.findElement(By.className("radius"));

			userNameElement.sendKeys(username);
//			passwordElement.sendKeys(password);

			loginElement.click();
	 }
	@Then("^User get confirmation$")
	public void confirmation() {
//		 driver = new ChromeDriver();
		WebElement confirmationElement = driver.findElement(By.id("flash"));
		String message = confirmationElement.getText();
		assertTrue(message.contains("logged into"));
		driver.close();
	}
	
	@Then("^User get error confirmation$")
	public void errorconfirmation() {
//		 driver = new ChromeDriver();
		WebElement confirmationElement = driver.findElement(By.id("flash"));
		String message = confirmationElement.getText();
		System.out.println(message);
		assertTrue(message.contains("is invalid"));
		driver.close();
	}

}

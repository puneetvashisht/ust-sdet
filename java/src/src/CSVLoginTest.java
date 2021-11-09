import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

@RunWith(value = Parameterized.class)
public class CSVLoginTest {
	String username;
	String password;
	WebDriver driver;

	// This is our Test Method
	@Test
	public void newCSVLoginTest() {
		System.out.println("NEW RECORD: " + this.username + " " + this.password);

//Getting the actual title of webpage from the webpage and then asserting it. 
//		String actualTitle = driver.getTitle();
//		String expectedTitle = "The Internet";
//		Assert.assertEquals(expectedTitle, actualTitle);

// Page-1 of the the Website.

		// Defining Web Elements of page-1

		// For increasing the readibility of our Code, here we are are using the
		// "WebElement" class
		// to declare and initialize the different elements to be used in the further
		// Code.
		WebElement usernameElement = driver
				.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
		WebElement passwordElement = driver.findElement(By.cssSelector("input[id='password']"));
		WebElement loginElement = driver.findElement(By.className("radius"));

//		WebElement logoutElement = driver.findElement(By.linkText("Logout"));
//		WebElement confirmationElement = driver.findElement(By.id("flash"));

		//// Enter Username
		//// driver.findElement(By.id("username")).sendKeys("tomsmith");

		// Enter username using "Relative-xpath" (Finding the element using
		// Relative-xpath)
		// driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");

		// Enter username using "Absolute-xpath" (Finding the element using
		// Absolute-xpath)
		usernameElement.sendKeys(username);

		//// Enter Password
		//// driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

		// Enter Password by using Relative-xpath (Finding the element using xpath)
		// driver.findElement(By.xpath("//input[@id='password']")).sendKeys("SuperSecretPassword!");

		//// Enter Password by css selector
		passwordElement.sendKeys(password);
		// Tag => input, Attribute ==> id, Value ==> 'password'

		// Login
		loginElement.click();

//Page2 of the Website
		// Defining Web Elements of page-2

		WebElement logoutElement = driver.findElement(By.linkText("Logout"));
		// Logout
		logoutElement.click();

//Page3 of the Website
		// Defining Web Elements of page-3
		WebElement confirmationElement = driver.findElement(By.id("flash"));

		// String loggedInConfirmation =
		// driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]")).getText();
		// System.out.println("Confirmation of successfully Logging in = " +
		// loggedInConfirmation);

		// Confirmation of successfully logging-out
		String loggedOutConfirmation = confirmationElement.getText();
		String expected = "You logged out of the secure area!";

		if (loggedOutConfirmation.contains(expected)) {
			System.out.println("CONFIRMATION: " + loggedOutConfirmation);
		} else {
			System.out.println("TEST FAILED !!!!! ");
		}

	}

	@Before
	public void setUp() {

		System.out.println();
		driver = utilitypackage.DriverFactory.open("firefox");
		// Accessing the Website using WebDriver
		driver.get("https://the-internet.herokuapp.com/login");

	}

	@After
	public void tearDown() {
		driver.close();
	}

	// The method is designed to provide parameters to this class
	@Parameters
	public static List<String[]> getData() {
		return utilitypackage.CSV.get("CSVFile.csv");
	}

	// Constructor that passes parameters to the newCSVLoginTest method
	public CSVLoginTest(String username, String password) {
		this.username = username;
		this.password = password;
	}

}
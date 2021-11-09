import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilitypackage.DriverFactory;

public class SeleniumTest {

//	@Test
	public void test() {
//		1. Get the jar file in the build path
//		2. Firefox/Chorme Driver .get("url")  - geckdriver.exe
//		3. Scripts to capture web page elements
//		4. Perfom actions on elements (click/sendKeys)

	}

	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		String browserType = "firefox";
		driver = DriverFactory.open(browserType);
//	    driver = new FirefoxDriver();
//		  driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void anotherTest() {
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		driver.get("https://the-internet.herokuapp.com/login");

		String actualTitle = driver.getTitle();
		String expectedTitle = "The Internet";
		assertEquals(expectedTitle, actualTitle);

		WebElement userNameElement = driver
				.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
		WebElement passwordElement = driver.findElement(By.cssSelector("input[id ='password']"));
		WebElement loginElement = driver.findElement(By.className("radius"));

		userNameElement.sendKeys(username);
		passwordElement.sendKeys(password);

		loginElement.click();

		WebElement logoutElement = driver.findElement(By.linkText("Logout"));
		logoutElement.click();

		WebElement confirmationElement = driver.findElement(By.id("flash"));
		String message = confirmationElement.getText();
//		System.out.println(message);
//		assertEquals(message, "You logged out of the secure area!");
		
		assertTrue(message.contains("You logged out"));

		// firefox, chrome, IE

	}

//	  @Test
	public void blazeDemoTest() {
		driver.get("https://blazedemo.com/");
		driver.manage().window().setSize(new Dimension(1602, 1003));
		driver.findElement(By.name("fromPort")).click();
		{
			WebElement dropdown = driver.findElement(By.name("fromPort"));
			dropdown.findElement(By.xpath("//option[. = 'Portland']")).click();
		}
		driver.findElement(By.cssSelector(".btn-primary")).click();
		driver.findElement(By.cssSelector("tr:nth-child(5) .btn")).click();
		driver.findElement(By.id("inputName")).click();
		driver.findElement(By.id("inputName")).sendKeys("Puneet Vashisht");
		driver.findElement(By.id("address")).sendKeys("825, Bhogal Road, Jangpura, Jangpura");
		driver.findElement(By.id("city")).sendKeys("New Delhi");
		driver.findElement(By.id("state")).sendKeys("Delhi");
		driver.findElement(By.id("zipCode")).sendKeys("110014");
		driver.findElement(By.id("creditCardNumber")).click();
		driver.findElement(By.id("creditCardNumber")).sendKeys("655464656565656");
		driver.findElement(By.id("nameOnCard")).click();
		driver.findElement(By.id("nameOnCard")).sendKeys("John Simth");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		driver.findElement(By.cssSelector("pre")).click();
	}

}

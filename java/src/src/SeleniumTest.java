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
import org.openqa.selenium.chrome.ChromeDriver;

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
//	    driver = new FirefoxDriver();
		  driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
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

package JUnitDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import JUnitDemo.WaitTypes;

public class ExplicitWaitWithUtility {
	private WebDriver driver;
	private String baseUrl;
	WaitTypes wt;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/raiko/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com";
		driver.manage().window().maximize();
		wt = new WaitTypes(driver);
		
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		WebElement emailField= wt.waitForElement(By.id("user_email"), 3);
		emailField.sendKeys("test");
		
		wt.clickWhenReady(By.name("commit"), 3);
				
		
		//driver.findElement(By.id("user_email")).sendKeys("test");
	
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}



}

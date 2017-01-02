package JUnitDemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/raiko/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com";
		driver.manage().window().maximize();
	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user_email")));
		emailField.sendKeys("test");
		
		//driver.findElement(By.id("user_email")).sendKeys("test");
	
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}



}

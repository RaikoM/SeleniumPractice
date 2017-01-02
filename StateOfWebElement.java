package JUnitDemo;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StateOfWebElement {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/raiko/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseURL = "https://www.google.com";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
	@Test
	public void test() {
		WebElement element = driver.findElement(By.id("gs_htif0"));
		System.out.println("Element is enabled? " + element.isEnabled());
		
		WebElement element2 = driver.findElement(By.id("gs_taif0"));
		System.out.println("Element is enabled? " + element2.isEnabled());
		
		WebElement element3 = driver.findElement(By.id("lst-ib"));
		System.out.println("Element is enabled? " + element3.isEnabled());
		
		element3.sendKeys("letskodeit");
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}



}

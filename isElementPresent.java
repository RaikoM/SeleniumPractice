package JUnitDemo;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import JUnitDemo.GenericMethods;

public class isElementPresent {
	private WebDriver driver;
	private String baseUrl;
	private GenericMethods gm;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/raiko/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/p/practice";
		gm = new GenericMethods(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		
		boolean result = gm.isElementPresent("name", "id");
		System.out.println("Size of list: " + result);
		
		boolean result2 = gm.isElementPresent("name-not-present", "id");
		System.out.println("Size of list: " + result2);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}



}

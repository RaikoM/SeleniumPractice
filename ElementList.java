package JUnitDemo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import JUnitDemo.GenericMethodsOld;

public class ElementList {
	private WebDriver driver;
	private String baseUrl;
	private GenericMethodsOld gm;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/raiko/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/p/practice";
		gm = new GenericMethodsOld(driver);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	public void test() {
		driver.get(baseUrl);
		
		List<WebElement> elementList = gm.getElementList("//input[@type='text']", "xpath");
		
		int size = elementList.size();
		
		System.out.println("Size of list: " + size);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}



}

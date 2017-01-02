package JUnitDemo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarSelection {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/raiko/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "http://www.expedia.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@Test
	public void test() {
		driver.get(baseUrl);
		driver.findElement(By.id("tab-flight-tab")).click();
		WebElement departingField = driver.findElement(By.id("flight-departing"));
		departingField.click();
		//WebElement dateToSelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button[@data-day='21']"));
		//dateToSelect.click();
		
		WebElement datesToSelect = driver.findElement(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button[@class='datepicker-cal-date']"));
		
		List<WebElement> allValidDates = datesToSelect.findElements(By.tagName("button"));
		
		for (WebElement date : allValidDates) {
			if (date.getText().equals("22")){
				date.click();
				break;
			}		
		}
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}



}

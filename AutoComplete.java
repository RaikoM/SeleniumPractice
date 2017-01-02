package JUnitDemo;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoComplete {
	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/raiko/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "http://www.southwest.com";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		String searchingText = "New York/Newark, NJ - EWR";
		String partialText = "EWR";
		
		WebElement text = driver.findElement(By.id("air-city-departure"));
		text.sendKeys(partialText);
		
		WebElement element = driver.findElement(By.xpath("//div[@class='overlay']"));
		List<WebElement> results = element.findElements(By.tagName("li"));
		int size = results.size();
		for (int i = 0; i<size; i++){
			System.out.println(results.get(i).getText());
		}
		
		/*Thread.sleep(3000);
		for (WebElement result : results){
			if (result.getText().equals(searchingText)){
				result.click();
			}				
		}*/
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}



}

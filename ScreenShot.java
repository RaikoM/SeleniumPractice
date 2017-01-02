package ExecutingJSDemo;

import static org.junit.Assert.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

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
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.findElement(By.id("tab-flight-tab")).click();
		WebElement flightOrigin = driver.findElement(By.id("package-origin"));
		WebElement flightDestination = driver.findElement(By.id("package-destination"));
		WebElement startDate = driver.findElement(By.id("package-departing"));
		WebElement endDate = driver.findElement(By.id("package-returning"));
		WebElement searchButton = driver.findElement(By.id("search-button"));
		
		flightOrigin.sendKeys("New York");
		startDate.sendKeys("09/03/2017");
		endDate.clear();
		endDate.sendKeys("09/10/2017");
		flightDestination.sendKeys("New York");
		searchButton.click();
		
	}

	public static String getRandomString(int length) {
		StringBuilder sb = new StringBuilder();
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for (int i = 0; i<length; i++){
			int index = (int) Math.random() * characters.length();
			sb.append(characters.charAt(index));
		}
		return sb.toString();
	}
	@After
	public void tearDown() throws Exception {
		String fileName = getRandomString(10) + ".png";
		String directory = "//home//raiko//workspace//";
		
		File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourceFile, new File(directory + fileName));
		
		Thread.sleep(2000);
		driver.quit();
	}

}

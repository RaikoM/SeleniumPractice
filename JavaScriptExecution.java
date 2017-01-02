package ExecutingJSDemo;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecution {

	private WebDriver driver;
	String baseUrl;
	private JavascriptExecutor js;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/home/raiko/workspace/geckodriver");
		driver = new FirefoxDriver();
		baseUrl = "http://letskodeit.teachable.com/p/practice";
		js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test
	public void test() {
	//driver.get(baseUrl);
	js.executeScript("window.location = 'http://letskodeit.teachable.com/p/practice'");
	
	
	
	
	
	//long height = (Long) js.executeScript("return window.innerHeight;");
	//long width = (Long) js.executeScript("return window.innerWidth;");
	
	//System.out.println("Height is: " + height);
	//System.out.println("Width is: " + width);
	
	//WebElement textBox = driver.findElement(By.id("name"));
	//WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
	//textBox.sendKeys("test");
	
	}
	
	@After
	public void tearDown() throws Exception {
	}



}

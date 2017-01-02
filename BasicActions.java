package JUnitDemo;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicActions {

	WebDriver driver;
	String baseURL;
	
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseURL = "https://letskodeit.teachable.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.xpath("//a[@href='/sign_in']")).click();
		System.out.println("Clicked on login");
		driver.findElement(By.id("user_email")).sendKeys("test@email.com");
		System.out.println("Sending keys to username field");
		driver.findElement(By.id("user_password")).sendKeys("Tere123");
		System.out.println("Sending keys to password field");
		driver.findElement(By.id("user_email")).clear();
		System.out.println("Clear username field");
	}
	
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}



}

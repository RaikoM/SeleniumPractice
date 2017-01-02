package JUnitDemo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonsAndCheckboxes {

	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
	}
	@Test
	public void test() throws Exception {
		WebElement bmwRadioBtn = driver.findElement(By.id("bmwradio"));
		bmwRadioBtn.click();
		Thread.sleep(2000);
		
		WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
		benzRadioBtn.click();
		
		WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
		bmwCheckBox.click();
		Thread.sleep(2000);
		
		WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
		benzCheckBox.click();
		
		System.out.println("BMW Radio is selected?" + bmwRadioBtn.isSelected());
		System.out.println("Benz Radio is selected?" + benzRadioBtn.isSelected());
		System.out.println("BMW Checkbox is selected?" + bmwCheckBox.isSelected());
		System.out.println("Benz Checkbox is selected?" + benzCheckBox.isSelected());
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
	}



}

package ElementsUsingLinkText;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		driver = new FirefoxDriver();
		String baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		//driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.partialLinkText("ogin")).click();
		Thread.sleep(2000);  // ootab 2 sekundit

	}
}

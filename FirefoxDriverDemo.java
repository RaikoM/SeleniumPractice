package FirefoxDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

		public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\raiko_000\\workspace\\geckodriver.exe");
			WebDriver driver;
			driver = new FirefoxDriver();
			String baseURL = "http://www.google.com";
			
			driver.get(baseURL);
		}
	}
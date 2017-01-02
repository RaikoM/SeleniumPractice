package basicweb;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DesiredCapabilitiesDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setBrowserName("firefox");
		caps.setPlatform(Platform.WIN8);
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\raiko_000\\workspace\\geckodriver.exe");
		driver = new FirefoxDriver(caps);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");

	}

}

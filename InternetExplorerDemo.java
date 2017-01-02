package InternetExplorerDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerDemo {

	public static void main(String[] args) {
		WebDriver driver;
		// System.setProperty("webdriver.ie.driver", "C:\\Users\\raiko_000\\workspace\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		String baseURL = "http://www.google.com";
		driver.get(baseURL);

	}

}

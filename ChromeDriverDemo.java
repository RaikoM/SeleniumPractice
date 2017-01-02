package ChromeDriverDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		
		// http://chromedriver.storage.googleapis.com/index.html
		String baseURL = "http://www.minutv.ee";
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raiko_000\\workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseURL);	
		driver.quit();

	}

}

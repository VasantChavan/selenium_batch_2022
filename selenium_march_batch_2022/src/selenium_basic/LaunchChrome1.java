package selenium_basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.google.com");

		driver.quit();
	}

}

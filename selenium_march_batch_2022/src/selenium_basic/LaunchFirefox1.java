package selenium_basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
				
		driver.get("http://www.gmail.com");
		
		driver.quit();
	}

}


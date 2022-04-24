package selenium_basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
				new FirefoxDriver();
	}

}


//Exception in thread "main" java.lang.IllegalStateException:
//The path to the driver executable must be set by the 
//webdriver.gecko.driver system property
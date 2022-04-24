package selenium_basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) {
		
		new ChromeDriver();   //java.lang.IllegalStateException: 
	}

}

//Exception in thread "main" java.lang.IllegalStateException:
//The path to the driver executable must be set by the webdriver.chrome.driver
//system property;
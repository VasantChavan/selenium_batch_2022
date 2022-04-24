package webdriver_browser_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndCloseCommands {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
				
		//driver.get("www.facebook.com"); 
		//Exception in thread "main" org.openqa.selenium.InvalidArgumentException:
	
		driver.get("http://www.naukri.com/");
		
		//driver.close();
		
		driver.quit();
		
	}

}

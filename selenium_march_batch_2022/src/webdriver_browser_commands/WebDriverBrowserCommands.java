package webdriver_browser_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBrowserCommands {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com/");
		
		String fb_title = driver.getTitle();
		
		System.out.println(fb_title);		
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
				
		String pagesource = driver.getPageSource();
				
		System.out.println(pagesource);
		
	}

}

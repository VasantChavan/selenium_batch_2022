package webdriver_browser_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverNavigationsCommands {
	
	
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		// Parent p = new Child();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		//driver.get("http://www.facebook.com/");
		
		
		driver.navigate().to("http://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		
	}

}

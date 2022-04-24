package webdriver_browser_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToVsGetCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");

		// Parent p = new Child();
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
				
		driver.get("http://www.facebook.com/");
		//driver.navigate().to("http://www.facebook.com/");
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		
		driver.quit();

	}
}

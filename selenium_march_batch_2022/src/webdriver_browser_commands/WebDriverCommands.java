package webdriver_browser_commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement forgotpwd = driver.findElement(By.linkText("Forgotten password?"));
		forgotpwd.click();
		
		List<WebElement> list_ele = driver.findElements(By.tagName("a"));
		
		int total_links = list_ele.size();
		
		
		
		System.out.println("Total links count on fb_page are :- "+ total_links);
		
		driver.quit();
	}

}

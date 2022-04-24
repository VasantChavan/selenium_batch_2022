package handledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dayDD = driver.findElement(By.name("birthday_day"));
		WebElement monthDD = driver.findElement(By.name("birthday_month"));
		//WebElement yearDD = driver.findElement(By.name("birthday_year"));
		
		
		Select selDay = new Select(dayDD);
		
		// Select by index
		selDay.selectByIndex(16); // index as a 16 It will select date as 17th
		
		Thread.sleep(5000);
		// Select by VisibleText
		selDay.selectByVisibleText("25");
		Thread.sleep(5000);
		
		// selectByValue
		selDay.selectByValue("12");
		Thread.sleep(5000);
		
		Select selMonth = new Select(monthDD);
		
		selMonth.selectByIndex(4);
		Thread.sleep(5000);
		
		selMonth.selectByVisibleText("Oct");
		Thread.sleep(5000);
		selMonth.selectByValue("8");
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}

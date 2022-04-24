package handledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dayDD = driver.findElement(By.name("birthday_day"));
		WebElement monthDD = driver.findElement(By.name("birthday_month"));
		WebElement yearDD = driver.findElement(By.name("birthday_year"));
		
		// 12 - may -2021
		
		// select by index
		select_dropdown_by_index(dayDD,11);
		select_dropdown_by_index(monthDD,4);
		select_dropdown_by_index(yearDD,1);
				
		Thread.sleep(3000);
		
		select_dropdown_by_visibletext(dayDD,"10");
		select_dropdown_by_visibletext(monthDD,"Aug");
		select_dropdown_by_visibletext(yearDD,"1989");
		
		Thread.sleep(3000);
		
		select_dropdown_by_value(dayDD,"15");
		select_dropdown_by_value(monthDD,"11");
		select_dropdown_by_value(yearDD,"2010");
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	
	static void select_dropdown_by_index(WebElement ele, int index) {
		new Select(ele).selectByIndex(index);
	}
	
	static void select_dropdown_by_visibletext(WebElement ele, String text) {
		new Select(ele).selectByVisibleText(text);
	}
	static void select_dropdown_by_value(WebElement ele, String value) {
		new Select(ele).selectByValue(value);
	}

}

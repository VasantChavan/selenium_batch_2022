package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com");

		WebElement txt_uname = driver.findElement(By.name("txtUsername"));
		WebElement txt_upwd = driver.findElement(By.name("txtPassword"));
		WebElement loginBtn = driver.findElement(By.name("Submit"));
		
		
		txt_uname.sendKeys("Admin");
		txt_upwd.sendKeys("admin123");
		loginBtn.click();
		
		driver.quit();
	}

}

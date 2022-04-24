package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOncssSelector {

	
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("http://www.facebook.com/");
	
	// To represents attribute name as class in cssSelector use .
	//To represents attribute name as id in cssSelector use #
	
	
	System.out.println(driver.findElement(By.cssSelector("._8eso")).getText());
	driver.findElement(By.cssSelector("#email")).sendKeys("abcd@gmail.com");
	driver.findElement(By.cssSelector("#pass")).sendKeys("abcd@123$");
	
	driver.findElement(By.name("login")).click();
	
	
	System.out.println(driver.getTitle());
	
	
	driver.quit();
}
}

package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatedBasedOnClassname {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement fb_heading = driver.findElement(By.className("_8eso"));
		String heading =fb_heading.getText();
		
		System.out.println(heading);
		
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("abc@gmail.com");
				
		driver.quit();
	}

}

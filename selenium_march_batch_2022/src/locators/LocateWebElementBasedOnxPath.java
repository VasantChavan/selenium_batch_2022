package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateWebElementBasedOnxPath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.facebook.com/");
		
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/"
//				+ "div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/"
//				+ "form[1]/div[1]/div[1]/input[1]")).sendKeys("abcd@gmail.com");
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/"
//				+ "div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/"
//				+ "div[1]/div[2]/div[1]/input[1]")).sendKeys("abcd@gmail.com");
//		
//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/"
//				+ "div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/"
//				+ "form[1]/div[2]/button[1]")).click();
//		
		
				
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abcde@gmail.com");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcde@1324%");
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("abcde@gmail.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("abcde@1324%");
		driver.findElement(By.cssSelector("button[name='login']")).click();
				
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
	}

}

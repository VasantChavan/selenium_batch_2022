package handledropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Sign Up")).click();
		
	
		WebElement monthDD = driver.findElement(By.name("birthday_month"));
		Select sel = new Select(monthDD);
		
		WebElement selected = sel.getFirstSelectedOption();
		
		System.out.println("Before selection the dropdown value selected is :"
				+ " "+ selected.getText());
		
		Thread.sleep(3000);
		sel.selectByVisibleText("Sep");
		
		System.out.println("Aafter selection the dropdown value selected is : "
				+ ""+sel.getFirstSelectedOption().getText());
		Thread.sleep(3000);
		
		driver.quit();
		
	}
	

}

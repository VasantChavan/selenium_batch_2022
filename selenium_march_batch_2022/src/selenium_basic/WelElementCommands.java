package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelElementCommands {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://facebook.com/");

		driver.findElement(By.linkText("Sign Up")).click();

		WebElement maleRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='2']"));
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//input[@type='radio' and @value='1']"));
		WebElement signupBtn = driver.findElement(By.xpath("//button[@name='websubmit']"));

		if (maleRadioBtn.isDisplayed()) {
			System.out.println("is displayed :");
			maleRadioBtn.click();
			if (maleRadioBtn.isSelected()) {
				System.out.println("is selected :");
				femaleRadioBtn.click();
			}
		}

		if (signupBtn.isEnabled()) {
			System.out.println("is enabled :");
			signupBtn.click();
		}

	}

}

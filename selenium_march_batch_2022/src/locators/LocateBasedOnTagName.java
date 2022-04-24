package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateBasedOnTagName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.facebook.com/");

		List<WebElement> list_a = driver.findElements(By.tagName("a"));

		int count = list_a.size();

		System.out.println("Total links on facebook login page are : " + count);

		// Approach -01
		for (int i = 0; i < count; i++) {

			String linkText = list_a.get(i).getText();
			System.out.println(linkText);
			if (linkText.equals("Terms")) {
				list_a.get(i).click();
				break;
			}

		}

		// Approach -02
		for (WebElement ele : list_a) {
			String linkText = ele.getText();
			System.out.println(linkText);
			if (linkText.equals("About")) {
				ele.click();
				break;
			}

		}

		driver.quit();

	}

}

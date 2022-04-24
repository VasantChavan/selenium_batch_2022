package handledropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown3 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Sign Up")).click();

		WebElement monthDD = driver.findElement(By.name("birthday_month"));
		
		select_dropdown_options(monthDD,"Aug");
		select_dropdown_options(driver.findElement(By.name("birthday_day")), "15");
		select_dropdown_options(driver.findElement(By.name("birthday_year")), "2021");
		
//		Select sel = new Select(monthDD);
//
//		List<WebElement> list = sel.getOptions();
//		int total_month = list.size();
//
//		System.out.println("total months are : " + total_month);
//
//		for (WebElement ele : list) {
//			String month = ele.getText();
//			System.out.println("month name is : " + month);
//			if (month.equals("Jun")) {
//				ele.click();
//				break;
//			}
//		}

		Thread.sleep(3000);

		driver.quit();

	}

	static void select_dropdown_options(WebElement ele, String option) {
		List<WebElement> list = new Select(ele).getOptions();
		for (WebElement el : list) {

			if (el.getText().equals(option)) {
				el.click();
				break;
			}
		}
	}

}

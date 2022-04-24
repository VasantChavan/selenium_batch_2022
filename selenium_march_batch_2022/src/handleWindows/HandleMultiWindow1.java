package handleWindows;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultiWindow1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		String parentWinID = driver.getWindowHandle();

		System.out.println(parentWinID + "---> " + driver.getTitle());

		WebElement OrangeHRMLink = driver.findElement(By.partialLinkText("OrangeHRM"));
		WebElement LinkedInImg = driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		WebElement FacebookImg = driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));

		OrangeHRMLink.click();
		LinkedInImg.click();
		FacebookImg.click();

		Set<String> handles = driver.getWindowHandles();
		List<String> hList = new ArrayList<String>(handles);

		if (switchToCorrrectWindow(driver, "Open Source HR Software", hList)) {
			System.out.println(driver.getTitle() + "   " + driver.getCurrentUrl());
		}

		closeAllWindow(driver, hList, parentWinID);

		switchToParentWindow(driver, parentWinID);

		driver.close();

		// driver.quit();

	}

	public static void switchToParentWindow(WebDriver driver, String parentWinID) {

		driver.switchTo().window(parentWinID);
	}

	public static void closeAllWindow(WebDriver driver, List<String> hList, String parentWinID) {
		for (String win : hList) {
			if (!parentWinID.equals(win)) {
				driver.switchTo().window(win).close();
			}
		}
	}

	public static boolean switchToCorrrectWindow(WebDriver driver, String windowTitle, List<String> hList) {

		for (String win : hList) {
			String title = driver.switchTo().window(win).getTitle();
			if (title.contains(windowTitle)) {
				System.out.println("  found the right window  ");
				return true;
			}
		}

		return false;
	}

}

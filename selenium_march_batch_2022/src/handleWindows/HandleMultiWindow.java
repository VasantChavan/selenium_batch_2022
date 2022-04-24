package handleWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultiWindow {

	public static void main(String[] args)  {

		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		String parentWinID = driver.getWindowHandle();
		
		System.out.println(parentWinID +"---> "+ driver.getTitle());
		
		WebElement OrangeHRMLink = driver.findElement(By.partialLinkText("OrangeHRM"));
		WebElement LinkedInImg = driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']"));
		WebElement FacebookImg = driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']"));
		
		OrangeHRMLink.click();
		LinkedInImg.click();
		FacebookImg.click();
	
		
		Set<String> windowId = driver.getWindowHandles();
		int totalWindow = windowId.size();
		System.out.println("Total window opened currrently : "+ totalWindow);
		
		for(String id :windowId) {
			//System.out.println("window id : "+ id);
			
			if(!parentWinID.equals(id)) {
				driver.switchTo().window(id);
				System.out.println(driver.getTitle());
				driver.close();
			}
			
			driver.switchTo().window(parentWinID);
		}
		
		//driver.close();
			
		driver.quit();
		
	}

}

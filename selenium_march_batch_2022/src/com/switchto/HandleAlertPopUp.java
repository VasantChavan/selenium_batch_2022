package com.switchto;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		WebElement alertwithokbtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));

		alertwithokbtn.click();

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();

		System.out.println("Alert box text : " + alertText);

		alert.accept();

		String result = driver.findElement(By.xpath("//*[@id='result']")).getText();

		System.out.println("after click on ok button : " + result);

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		System.out.println("Text on alert box is : " + alert.getText());

		alert.dismiss();

		System.out.println("after click on cancel button : "
		+ driver.findElement(By.xpath("//*[@id='result']")).getText());

		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();

		alert.sendKeys("Welcome to alert box");

		alert.accept();

		System.out.println(
				"after click on Ok button : " + driver.findElement(By.xpath("//*[@id='result']")).getText());

		Thread.sleep(3000);

		driver.quit();

	}
}

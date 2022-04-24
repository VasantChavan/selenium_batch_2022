package testngFramework;

import org.testng.annotations.Test;

public class PriotiseTestInTestNG {

	
	@Test(priority = 1)
	public void loginTest() {
		System.out.println("loginTest()");
	}
	@Test(priority = 2)
	public void addTocardTest() {
		System.out.println("addTocardTest()");
	}
	@Test(priority = 3)
	public void checkOutTest() {
		System.out.println("checkOutTest()");
	}
	@Test(priority = 4)
	public void logoutTest() {
		System.out.println("logoutTest()");
	}
	
}

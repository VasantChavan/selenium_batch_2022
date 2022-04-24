package testngFramework;

import org.testng.annotations.Test;

public class DependaceTestInTestNG {

	
	@Test
	public void loginTest() {
		System.out.println("loginTest()");
	}
	@Test(dependsOnMethods = {"loginTest"})
	public void addTocardTest() {
		System.out.println("addTocardTest()");
	}
	@Test(dependsOnMethods = {"loginTest","addTocardTest"})
	public void checkOutTest() {
		System.out.println("checkOutTest()");
	}
	@Test(dependsOnMethods = {"checkOutTest"})
	public void logoutTest() {
		System.out.println("logoutTest()");
	}
}

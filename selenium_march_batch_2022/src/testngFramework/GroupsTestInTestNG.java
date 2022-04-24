package testngFramework;

import org.testng.annotations.Test;

public class GroupsTestInTestNG {

	@Test(groups = { "smoke" })
	public void loginTest() {
		System.out.println("loginTest() (groups = { \"smoke\" })");
	}

	@Test(groups = { "sanity" })
	public void logoutTest() {
		System.out.println("logoutTest() (groups = { \"sanity\" })");
	}

	@Test(groups = { "regression" })
	public void createAnAccount() {
		System.out.println(" createAnAccount() (groups = { \"regression\" })");
	}

}

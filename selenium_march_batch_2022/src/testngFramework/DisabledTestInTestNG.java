package testngFramework;

import org.testng.annotations.Test;

public class DisabledTestInTestNG {
	
	@Test
	public void test1() {
		System.out.println("test1()");
	}
	@Test(enabled = true)
	public void test2() {
		System.out.println("test2()");
	}
	@Test(enabled = true)
	public void test3() {
		System.out.println("test3()");
	}
	@Test(enabled = false)
	public void test4() {
		System.out.println("test4()");
	}
	@Test
	public void test5() {
		System.out.println("test5()");
	}
}

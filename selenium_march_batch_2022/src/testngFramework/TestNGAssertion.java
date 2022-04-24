package testngFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertion {
	
	
	@Test
	public void test1()
	{
		System.out.println("test1 started");
		Assert.assertTrue(true);
		System.out.println("test1 ended");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2 started");
		Assert.assertTrue(false);
		System.out.println("test2 ended");
	}
	
	@Test
	public void test3()
	{
		System.out.println("test3 started");
		Assert.assertFalse(false);
		System.out.println("test3 ended");
	}
	
	@Test
	public void test4()
	{
		System.out.println("test4 started");
		Assert.assertFalse(true);
		System.out.println("test4 ended");
	}
	
	@Test
	public void test5()
	{
		String Es1 = "vasant";
		String As2 = "vasant";
		Assert.assertEquals(As2, Es1);
		System.out.println("test5 ended");
	}
	
	@Test
	public void test6()
	{
		String Es1 = "vasant";
		String As2 = "Vasant";
		Assert.assertEquals(As2, Es1,"Expected result doesn't matche with actual result");
		System.out.println("test6 ended");
	}
	
	

}

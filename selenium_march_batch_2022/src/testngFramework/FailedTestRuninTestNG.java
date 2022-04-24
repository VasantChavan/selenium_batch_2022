package testngFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestRuninTestNG {
	
	@Test
	public void test1()
	{
		Assert.assertEquals("Hi", "Hi");
	}
	
	@Test
	public void test2()
	{
		Assert.assertEquals("Hi", "Hello","Expected Hello but getting differnt actual value");
	}
	@Test
	public void test3()
	{
		Assert.assertTrue(true);
	}
	@Test
	public void test4()
	{
		Assert.assertTrue(false,"Expecting true but found false value");
	}
	

}

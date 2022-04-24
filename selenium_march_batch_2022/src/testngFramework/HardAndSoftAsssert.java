package testngFramework;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert; 

public class HardAndSoftAsssert {
	
	@Test
	public void hardAssert()
	{
		System.out.println("statement before hard Assert..");
		Assert.assertTrue(true);
		System.out.println("statement after hard Assert..");
		
		Assert.assertTrue(false);
		System.out.println("statement after hard Assert..");
	}

	
	@Test
	public void softAssert()
	{
		SoftAssert softAssert = new SoftAssert();
		
		System.out.println("statement before soft assert");
		softAssert.assertTrue(true);
		System.out.println("statement after soft assert pass");
		
		softAssert.assertTrue(false);
		System.out.println("statement after soft assert failed");
		
		softAssert.assertAll();
	}
}

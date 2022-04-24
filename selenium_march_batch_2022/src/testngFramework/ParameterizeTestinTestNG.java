package testngFramework;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizeTestinTestNG {

	
	@Test
	@Parameters({"s1","s2"})
	public void paraTest(@Optional("Raman")String val1,
			@Optional("Ravi")String val2) {
		
		System.out.println("my first para " + val1);
		System.out.println("my second para " + val2);
	}
}

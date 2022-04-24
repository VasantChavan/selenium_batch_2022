package testngFramework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTInTestNg {
	
	
	@Test(dataProvider ="testdata")
	public void getData(Object ename, Object eid, Object esal)
	{
		System.out.println("Emp name is : "+ ename +" Emp id is :"+ eid+"  Emp sal is :"+ esal);
	}
	
	@DataProvider(name ="testdata")
	public Object[][] createTestData()
	{
		Object[][] data = new Object[3][3];
		
		data[0][0] = "Vasant";
		data[0][1] = 12321;
		data[0][2] = 25000.45;
		
		data[1][0] = "Raman";
		data[1][1] = 12345;
		data[1][2] = 20000.45;
		
		data[2][0] = "Vaishali";
		data[2][1] = 12131;
		data[2][2] = 35000.45;
		
		
		return data;
		
	}

}

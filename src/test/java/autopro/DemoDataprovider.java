package autopro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataprovider {

	@DataProvider(name = "externalData")
	public Object[][] data(){
		Object[][] obj = new Object[2][2];
		obj[0][0] = "nitheesha";
		obj[0][1] = "priyanka";
		obj[1][0] = "nitheesha";
		obj[1][1] = "priyanka";
		return obj;
	}
	
	@Test(dataProvider ="externalData")
	public void deriveData(String name1, String name2 ) {
		System.out.println(name1+" , "+ name2);
	}
}

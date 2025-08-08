package assertioons;

import org.testng.Assert;
import org.testng.annotations.Test;
//Assertions for VALIDATION
public class AssertionsDemo {
	@Test
	void testTitle()
	{
		String act_result = "Opencart";
		//String expt_result = "Openshop"; //failed TC
		String expt_result = "Opencart";  //passed TC
		
		/*if(act_result.equals(expt_result))
		{
			System.out.println("Passed");
		}
		else {
			System.out.println("failed");
		}*/   // It is telling testcase is passed but actually it is failed
		//To overcome this we go for Assertions
		Assert.assertEquals(act_result, expt_result); //
	}

}

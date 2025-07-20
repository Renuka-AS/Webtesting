package annotationsHirarcy;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class c2 {
	@Test
	void abc()
	{
		System.out.println("printing abc");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("after test execution...");
	}

}

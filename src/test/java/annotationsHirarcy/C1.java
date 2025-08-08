package annotationsHirarcy;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {
	@Test
	void xyz()
	{
		System.out.println("printing xyz");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("Before test execution...");
	}
}

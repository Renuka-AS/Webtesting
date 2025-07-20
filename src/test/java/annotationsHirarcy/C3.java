package annotationsHirarcy;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class C3 {
	@Test
	void pqr() {
		System.out.println("print pqr...");
	}
	@BeforeSuite
	void bs() {
		System.out.println("This is before suite...");
	}
	@AfterSuite
	void as()
	{
		System.out.println("This is after suite");
	}

}

package annotationsHirarcy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allannotations {
	@BeforeSuite
	void bs()
	{
		System.out.println("Before suite annotion...");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("After suite annotion...");
	}
	@BeforeTest
	
	void bt()
	{
		System.out.println("Before test annotion...");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("After test annotion...");
	}
	
	@BeforeClass
	void bc()
	{
		System.out.println("Before class annotion...");
	}
	@AfterClass
	void ac()
	{
		System.out.println("After class annotion...");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("Before method annotion...");
	}
	@AfterMethod
	void am()
	{
		System.out.println("after method annotion...");
	}
	@Test
	void tm1() {
		System.out.println(" test Annotation 1");
	}
	@Test
	void tm2()
	{
		System.out.println(" test Annotation 2");

	}
	

}

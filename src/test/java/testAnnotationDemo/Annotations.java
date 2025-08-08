package testAnnotationDemo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	//login
	//search
	//logout
	//login
	//advanced search
	//log out
	
	@BeforeMethod
		void login()
	{
		System.out.println("loging application...");
		
	}
	@Test(priority = 1)
	void search() {
		System.out.println("searchh element....");
	}
	@Test(priority = 2)
	void advancedSearch()
	{
		System.out.println("Advanced search....");
	}
	@AfterMethod
	void logout()
	{
		System.out.println("logout application");
	}
	

}

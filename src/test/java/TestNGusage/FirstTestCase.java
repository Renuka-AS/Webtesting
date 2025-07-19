package TestNGusage;

import org.testng.annotations.Test;

public class FirstTestCase {
	//1. open app
	//2. Login 
	// 3. Logout
	@Test(priority = 0)
	void openapp(){
		System.out.println("Opening application....");
	}
	@Test(priority = 1)
	void login()
	{
		System.out.println("Login to application....");
	}
	@Test(priority = 2)
	void logout()
	{
		System.out.println("Logout application....");
	}

}

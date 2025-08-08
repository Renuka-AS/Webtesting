package testAnnotationDemo;

import org.testng.Assert;
import org.testng.annotations.Test;
//dependsOnMethod will decide if depended method method passed then only it will continue testing else it will skip those remaining methods
public class DependSOnMethods {
	//1. open app
	//2. Login 
	// 3. search
	//4. advancedsearch
	// 3. Logout
		@Test(priority = 0)
		void openapp(){
			System.out.println("Opening application....");
			Assert.assertTrue(true);
		}
		@Test(priority = 1,dependsOnMethods = "openapp")
		void login()
		{
			System.out.println("Login to application....");
			Assert.assertTrue(false);
		}
		@Test(priority = 0,dependsOnMethods = "login")
		void search(){
			System.out.println("search element....");
			Assert.assertTrue(true);
		}
		@Test(priority = 1,dependsOnMethods = {"login","search"})
		void advancedSearch()
		{
			System.out.println("Login to application....");
			Assert.assertTrue(true);
		}
		@Test(priority = 2,dependsOnMethods = "login")
		void logout()
		{
			System.out.println("Logout application....");
			Assert.assertTrue(true);
		}

}

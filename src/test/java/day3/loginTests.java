package day3;

import org.testng.annotations.Test;

public class loginTests {
	@Test(priority = 1, groups = {"sanity"})
	void loginbyEmail()
	{
		System.out.println("Login by email...");
	}
	@Test(priority = 1, groups = {"sanity"})
	void loginbyFacebook()
	{
		System.out.println("Login by Facebook...");
	}
	@Test(priority = 1, groups = {"sanity"})
	void loginbyTwitter()
	{
		System.out.println("Login by Twitter...");
	}
}

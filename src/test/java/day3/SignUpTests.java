package day3;

import org.testng.annotations.Test;

public class SignUpTests {
	@Test(priority = 1, groups = {"regression"})
	void SignUpbyEmail()
	{
		System.out.println("SignUp by email...");
	}
	@Test(priority = 1, groups = {"regression"})
	void SignUpbyFacebook()
	{
		System.out.println("SignUp by Facebook...");
	}
	@Test(priority = 1, groups = {"regression"})
	void SignUpbyTwitter()
	{
		System.out.println("Signup by Twitter...");
	}
}

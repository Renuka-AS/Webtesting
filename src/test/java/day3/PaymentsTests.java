package day3;

import org.testng.annotations.Test;

public class PaymentsTests {
	@Test(priority = 1, groups = {"sanity","regression","functional"})
	void PaymentinRupee()
	{
		System.out.println("Payment by Rupee...");
	}
	@Test(priority = 1, groups = {"sanity","regression","functional"})
	void PaymentsinDoller()
	{
		System.out.println("Login by Doller...");
	}

}

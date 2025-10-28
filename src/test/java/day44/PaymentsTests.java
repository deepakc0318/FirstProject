package day44;

import org.testng.annotations.Test;

public class PaymentsTests {
	
	
	@Test(priority=1,  groups= {"sanity","regression","functional"})
	void paymentInRuppees()
	{
		System.out.println("payment in rupees...");
	}
	
	
	@Test(priority=2,  groups= {"sanity","regression","functional"})
	void paymentInDollars()
	{
		System.out.println("payment in dollars...");
	}
	
	
	
	
	
	
	
	
	

}

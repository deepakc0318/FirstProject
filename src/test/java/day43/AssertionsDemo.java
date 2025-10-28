package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {
	
	
	@Test
	void testTitle()
	{
		String exp_title="opencart";
		String act_title="openshop";
		
		if(exp_title.equals(act_title))
		{
			System.out.println("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			System.out.println("test failed");
			Assert.assertTrue(false);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

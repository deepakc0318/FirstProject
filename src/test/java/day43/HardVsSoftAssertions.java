package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
	/*
	@Test
	void test_hardAssertions()
	{
	System.out.println("Testing...");	
	System.out.println("Testing...");	
	
	// hard Assertion
	Assert.assertEquals(1, 1);	// passed so the rest of the statements are executed	
	
	//rest of the statements	
	System.out.println("Testing...");	
	System.out.println("Testing...");		
		
	}
	
	@Test
	void test_hardAssertions1()
	{
	System.out.println("Testing...");	
	System.out.println("Testing...");
	
	// hard Assertion
	Assert.assertEquals(1, 2);		// failed	, so rest of the statments are not exectued
		
	System.out.println("Testing...");	
	System.out.println("Testing...");
	}
	*/
	
	//SOFT ASSERTIONS
	
	@Test
	void test_softAssertions()
	{
	System.out.println("Testing...");	
	System.out.println("Testing...");
	
	// soft Assertion
	SoftAssert sa=new SoftAssert();
	sa.assertEquals(1, 1);
		
	System.out.println("Testing...");	
	System.out.println("Testing...");
	
	sa.assertAll();	//mandatory
	

	}

}

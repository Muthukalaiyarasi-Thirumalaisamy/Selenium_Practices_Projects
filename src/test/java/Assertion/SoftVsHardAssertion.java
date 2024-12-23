package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftVsHardAssertion {

	
	
	@Test(priority=2)
	
	public void HandleSoftAssertion()
	{
		SoftAssert softAssert= new SoftAssert();
		System.out.println("handle soft assertion:");
		softAssert.assertEquals(false, true);
		
		System.out.println("handled soft assertion");
		softAssert.assertEquals(false, false);
		
		System.out.println("testing is done");
		softAssert.assertAll();
		
	}
	

	@Test(priority=1)
	
	public void HandleHardAssertion()
	{
		System.out.println("handle hard assertion:");
		Assert.assertEquals(false, true);
		
		System.out.println("handled hard assertion");
		Assert.assertEquals(false, false);
		
		System.out.println("hard testing is done");
		
		
	}
}

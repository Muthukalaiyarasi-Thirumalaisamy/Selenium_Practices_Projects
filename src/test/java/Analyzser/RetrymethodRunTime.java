package Analyzser;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetrymethodRunTime {
	
@Test
	
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2()
	{
		Assert.assertEquals(true, true);
	}

}

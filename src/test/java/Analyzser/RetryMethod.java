package Analyzser;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Analyzer.RetryAnalyzer;

public class RetryMethod {

	
	@Test(retryAnalyzer= com.Analyzer.RetryAnalyzer.class)
	
	public void Test1()
	{
		Assert.assertEquals(false, true);
	}
	
//	@Test
//	public void Test2()
//	{
//		Assert.assertEquals(true, false);
//	}
}

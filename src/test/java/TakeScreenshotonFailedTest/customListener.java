package TakeScreenshotonFailedTest;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class customListener extends Base implements ITestListener{
	

	    @Override
	    public void onTestStart(ITestResult result) {
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	    	failed(result.getMethod().getMethodName());
	    	System.out.println("Test Failed");
	       
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	    }

	    @Override
	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    }

	    @Override
	    public void onStart(ITestContext context) {
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	    }
	
	
}

	
	
	
	

	
	


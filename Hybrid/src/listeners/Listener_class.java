package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_class implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("exec started");	
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("tc passed");	
		ITestListener.super.onTestSuccess(result);
	}
	

	@Override
	public void onTestFailure(ITestResult result) {
System.out.println("tc failed");
		ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
System.out.println("tc skipped");		
ITestListener.super.onTestSkipped(result);
	}

}
package Listenners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class StartListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("on test Start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("On testSuccess");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("On Testfailure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("On test skip");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("On test failedBut withSucessPercentage");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("On TestFailedWithTimeOut");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("On Start");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
	}
 
}

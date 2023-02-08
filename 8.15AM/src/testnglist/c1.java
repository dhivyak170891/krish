package testnglist;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class c1 implements ITestListener {
	//class<=> interface :  class def=> implements interfacename 
		//ITestListener => Onstart(). onfinish(), ontestsuccess()....
		//right click=> source= > override/implement methods

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("SUCESSS!!!!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("FAILEDDDDD");
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("STARTED");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("FINISHED");
	}
	
	

}

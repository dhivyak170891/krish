package Testngattributes;

import org.testng.annotations.Test;

public class t1 {
	
	@Test(timeOut=1000)
	public void trans() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Transaction");
	}

}

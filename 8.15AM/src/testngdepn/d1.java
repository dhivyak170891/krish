package testngdepn;

import org.testng.annotations.Test;

public class d1 {
	
	// dependsOnMethods=> create connection between the tst cases
	
	
	@Test(priority=0)
	public void visiting()
	{
		System.out.println("visiting website");
	}
	
	@Test(priority=1, dependsOnMethods="visiting")
	public void login()
	{
		System.out.println("performing login");
	}
	
	// visiting : pass     login : pass
	// visiting: fail      login: skipped 

}

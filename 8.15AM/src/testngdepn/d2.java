package testngdepn;

import org.testng.annotations.Test;

public class d2 {

	//dependsOnGroups=> create connection between test cases and group
	
	@Test(priority=0,groups="l")
	public void enu()
	{
		System.out.println("entering username");
	}
	
	@Test(priority=1,groups="l")
	public void ep()
	{
		System.out.println("enteringpassword");
	}
	
	@Test(priority=2, groups="l")
	public void lg()
	{
		System.out.println("clicking on login button");
	}
	
	@Test(priority=3, dependsOnGroups="l")
	public void hme()
	{
		System.out.println("homen");
	}
	
	// l:  enu, enp, lg   :  pass       hme: pass
	//  even if 1 fails                 hme: skipped 
}

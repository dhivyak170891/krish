package Testngattributes;

import org.testng.annotations.Test;

public class to {
	
	/*
	 *Testng=> Test next generation
	 *testing framework
	 *test cases 
	 *report generation
	 *inspired from JUNIT
	 *
	 * test case
	 * nonstatic in nature
	 * @Test annotation before it
	 * default order: alphabetical order 
	 * 
	 * priority: arrange the test case in a particular order 
	 * description: add short note on the tst case 
	 * groups
	 * invocationcount: run the same test case for multiple time 
	 * enabled=false , ignore,disable
	 * timeout
	 * */
	
	@Test(priority=0,description="firsttestcase",groups="P",invocationCount=5,enabled=false)
	public void t1()
	{
		System.out.println("Tst case 1");
	}
	
	@Test(priority=1,description="second",groups="P")
	public void ab()
	{
		System.out.println("Tst case 2");
	}
	
	@Test(priority=2,groups="Q")
	public void t2()
	{
		System.out.println("Tst case 3");
	}

}

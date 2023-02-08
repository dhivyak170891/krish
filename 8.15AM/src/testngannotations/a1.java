package testngannotations;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class a1 {
	
	/*
	 *before test:  run only once before all the tst cases started its execution
	 *after test :run only once after all the tst cses finished its execution
	 *    
	 *before class:  run only once, after before test
	 *after class:   run only once, before after test 
	 *
	 *before method: run before each test case
	 *after method:  run after each test case
	 * 
	 * before test : visiting
	 * 
	 *   before class: max
	 *   
	 *        before method : refresh tc1: title   after method: cookies deletion
	 *        before method : refresh tc2: click   after method: cookies deletion
	 *     
	 *   after class: resizing
	 * 
	 * after test : closing
	 * 
* 
	 * */
	ChromeDriver driver;
	@BeforeMethod
	public void bm()
	{
		System.out.println("before method: refresh");
		driver.navigate().refresh();
	}
	
	@AfterMethod
	public void am()
	{
		
		System.out.println("after method: deleting cookies");
		driver.manage().deleteAllCookies();
	}
	
	@BeforeClass
	public void bc()
	{
		System.out.println("before class : max ");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void ac()
	{
		System.out.println("after class :resizing");
		Dimension d= new Dimension(300,500);
		driver.manage().window().setSize(d);
	}
	
	@Test(priority=0)
	public void tc1()
	{
		System.out.println("Test case 1 : title");
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=1)
	public void tc2()
	{
		System.out.println("Test case 2: clicking on images");
		driver.findElementByLinkText("Images").click();
	}
	
	@BeforeTest
	public void bt()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
		System.out.println("before test : website visiting");
	}
	
	@AfterTest
	public void at() throws InterruptedException
	{
		System.out.println("after test ");
		Thread.sleep(3000);
		driver.quit();
	}

}

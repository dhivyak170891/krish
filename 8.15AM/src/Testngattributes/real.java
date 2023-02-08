package Testngattributes;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class real {
	ChromeDriver driver;
	@Test(priority=0,description="visiting website",groups="U")
	public void visiting()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	}
	
	@Test(priority=1,description="maximising website",groups="U")
	public void max()
	{
		driver.manage().window().maximize();
	}
	
	@Test(priority=2,description="refreshing website",invocationCount=3,groups="U")
	public void refreshing()
	{
		driver.navigate().refresh();
	}
	
	@Test(priority=3,description="clicking on Privacy",dependsOnGroups="U")
	public void clicking()
	{
		driver.findElementByLinkText("Privacy").click();
	}
	
	@Test(priority=4,description="closing website",dependsOnGroups="U",timeOut=4000)
	public void closing() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}

}

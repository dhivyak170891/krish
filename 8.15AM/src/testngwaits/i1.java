package testngwaits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testnglist.c1.class)
public class i1 {
	
	/*
	 * webdriver synchronisation technique
	 *  
	 *      conditional           : explicit wait
	 *      unconditional         : implicit wait, thread.sleep()
	 *      
	 *      implicit wait : once it is declared all the code which is present after it will take the time limit
	 *      
	 *      code is correct: executes within timelimit, it will proceed further, it will not wait for the completion of time limit
	 *      code is wrong : it will wait for completion of time , then it will throw up error
	 * 
	 * */
	@Test
	public void imp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    System.out.println(driver.getTitle());//5
	    System.out.println(driver.getCurrentUrl());//5
	    driver.navigate().refresh();//5
	    driver.findElementByLinkText("dhivya"); //5
	    driver.quit();//5
	    
	}
}

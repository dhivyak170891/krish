package testngwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class expl {
	
	/*explicit wait: 
	 * 
	 * create an object for webdriver wait class
	 * pass driver instance and time limit as input
	 * call untill method
	 * call expected conditions 
	 * 
	 * 
	 * 
	 * code is correct: executes within timelimit, it will proceed further, it will not wait for the completion of time limit
	 *      code is wrong : it will wait for completion of time , then it will throw up error
 * 
	 * */
	@Test
	public void imp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    WebDriverWait w= new WebDriverWait(driver,5);
	    
	    //title
	    //w.until(ExpectedConditions.titleIs("yahoo"));  
	    //w.until(ExpectedConditions.titleContains("oo"));
	    
	    //alert is present
	   // w.until(ExpectedConditions.alertIsPresent());
	    
	    // visibility of an element
	    // find the element and check its visibility in a single line
	   // w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Privacy"))); 
	    
	    // element is clickable or not
	    //w.until(ExpectedConditions.elementToBeClickable(By.linkText("Privacy")));
	    
	    //visibility of more elements
	    w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.tagName("img")));
	    
	    
	    driver.quit();
	}

}

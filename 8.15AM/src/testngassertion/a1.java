package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class a1 {

	/*assertion : tech where we will be comparing actual result with obtained result
	 * 
	 * hard asserts:
	 *      static in nature
	 *      assertion fails, we cannot proceed further 
	 *      provided by assert builtin class 
	 *      
	 * soft asserts 
	 *     nnonstatic innnature
	 *     soft assert built in class
	 *     proceed further 
	 *     original: assertAll()
	 *     
	 *     
	 * assertequals(actual, expected)
	 * assertnotequals(actual, expected)
	 * assertTrue(condition)
	 * assertFalse(condition)
	 * 
	 * 
	 * 
	 * */
	
	@Test
	public void hr()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    //Assert.assertEquals(driver.getTitle(), "le");//fail
	    //Assert.assertNotEquals(driver.getTitle(), "yahoo");//pass
	  WebElement ele = driver.findElementByLinkText("Privacy");
	  Actions actions=new Actions(driver);
	  actions.contextClick(ele).perform();
	  actions.sendKeys("t").perform();
	  //Assert.assertTrue(ele.isDisplayed());//pass
	  //Assert.assertFalse(ele.isSelected());//pass
	    //driver.quit();
	}
}

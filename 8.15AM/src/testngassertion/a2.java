package testngassertion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class a2 {
	
	@Test
	public void sft()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Documents\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    
	    SoftAssert s= new SoftAssert();
	    
	  s.assertEquals(driver.getTitle(), "le");//fail
	  s.assertNotEquals(driver.getTitle(), "yahoo");//pass
	  WebElement ele = driver.findElementByLinkText("Privacy");
	  s.assertTrue(ele.isDisplayed());//pass
	  s.assertFalse(ele.isSelected());//pass
	    driver.quit();
	    s.assertAll();
	}

}

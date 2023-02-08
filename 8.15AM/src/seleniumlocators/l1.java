package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		/*locators :  identify particular element
		 * 
		 * 8 locators 
		 * 
		 *    id
		 *    name
		 *    classname  : not preferable
		 *    linktext
		 *    partial linktext
		 *    tagname
		 *    xpath 
		 *    css
		 ** 
		 * */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visiting 
		ob.get("http://www.mycontactform.com");
		
		//id=user
		ob.findElementById("user").sendKeys("Dhivyakarthi123");
		
		//name=pass
		ob.findElementByName("pass").sendKeys("12345");
		
		
		//classname= btn_log
		ob.findElementByClassName("btn_log").click();
		Thread.sleep(3000);
		
		ob.quit();
	}

}

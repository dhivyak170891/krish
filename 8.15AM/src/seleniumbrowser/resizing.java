package seleniumbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class resizing {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visiting 
		ob.get("http://www.facebook.com");
		
		//create an object for dimension class
		// pass desired height and width in it
		// apply it on the window
		
		//500,500
		
		//classname objectname= new classname();
		Dimension d= new Dimension(300,400);
		ob.manage().window().setSize(d);
		
		Thread.sleep(3000);
		
		ob.quit();
	}
}

package seleniumbrowser;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class repisitioning {
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	//visiting 
	ob.get("http://www.facebook.com");
	
	// create an object for point class
	// pass desired x and y value in it
	// apply it on the window
	
	//100,100
	Point pt= new Point(200,300);
	ob.manage().window().setPosition(pt);
	
	Thread.sleep(3000);
	
	ob.quit();
}
}

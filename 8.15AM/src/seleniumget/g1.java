package seleniumget;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visiting 
		ob.get("http://www.facebook.com");
		//title of the page
		System.out.println(ob.getTitle());
		//url of the page
		System.out.println(ob.getCurrentUrl());
		 
		// size of the window
		// size=> height and width => Dimension 
		
		Dimension s = ob.manage().window().getSize();
		System.out.println("Height is "+ s.getHeight());
		System.out.println("Width is "+ s.getWidth());
		
		//position of the window
		// x and y value => Point 
		
		Point d = ob.manage().window().getPosition();
		System.out.println("x value is "+ d.getX());
		System.out.println("Y value is "+ d.getY());
		
		//getting browser details
		Capabilities c = ob.getCapabilities();
		System.out.println("Browser name: "+ c.getBrowserName());
		System.out.println("BRowser version :"+ c.getVersion());
		System.out.println("os is "+ c.getPlatform());
		ob.quit();
	}
}

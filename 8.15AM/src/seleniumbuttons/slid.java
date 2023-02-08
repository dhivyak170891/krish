package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slid {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	//visiting 
	ob.get("https://jqueryui.com/slider/");
	
	// horizontal slider: move along x axis, y value will be 0
	// vertical slider:  move along y axis, x value will be 0
	
	ob.switchTo().frame(0);
	
	WebElement ele = ob.findElementById("slider");
	Actions ac= new Actions(ob);
	ac.dragAndDropBy(ele,50,0).build().perform();
}
}

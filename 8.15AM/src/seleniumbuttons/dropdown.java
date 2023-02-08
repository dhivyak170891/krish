package seleniumbuttons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visiting 
		ob.get("https://courses.letskodeit.com/practice");
		
		// create an object for select class
		// pass dropdown box as input
		// index, value, visible text 
		
		// only one option can be selected and deselection is not possible
		
		WebElement ele = ob.findElementById("carselect");
		Select s= new Select(ele);
		//s.selectByIndex(1);
		//s.selectByValue("benz");
		s.selectByVisibleText("Honda");
		Thread.sleep(3000);
		ob.quit();
	}
}

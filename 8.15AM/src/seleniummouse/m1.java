package seleniummouse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class m1 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * click
		 * double click
		 * context click
		 * mouse hover
		 * click, hold and release
		 * 
		 * drag and drop 
		 * drag and drop by
		 * 
		 * create an object for Actions class
		 * pass chromedriver obj as input
		 * 
		 * 
		 * */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visiting 
		ob.get("http://www.mycontactform.com");
		WebElement ele = ob.findElementByName("btnSubmit");
		Actions ac= new Actions(ob);
		//ac.click(ele).build().perform();
		//ac.doubleClick(ele).build().perform();
		//ac.contextClick(ele).build().perform();
		//ac.moveToElement(ele).click().build().perform();
		ac.clickAndHold(ele).build().perform();
		Thread.sleep(3000);
		ac.release(ele).build().perform();
	}
}

package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class radio {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	//visiting 
	ob.get("https://courses.letskodeit.com/practice");
	
	ob.findElementById("bmwradio").click();
	
	Thread.sleep(3000);
	ob.findElementById("benzradio").click();
	
	
	Thread.sleep(3000);
	ob.findElementById("hondaradio").click();
	
	
	Thread.sleep(3000);
	
	ob.quit();
}
}

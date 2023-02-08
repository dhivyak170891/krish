package seleniumexec;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class e2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		ob.get("http://www.mycontactform.com");
		
		//alert: popup/ confirmation /messagebox
		//alert creation
		//ob.executeScript("alert('timeout')");//ok
		
		ob.executeScript("window.confirm('timeout')"); //ok and cancel
		
		Thread.sleep(3000);
		// switching our control to the alert
		Alert al = ob.switchTo().alert();
		al.accept();
		
		Thread.sleep(3000);
		ob.quit();
	}
}

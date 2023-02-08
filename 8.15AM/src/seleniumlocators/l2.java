package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visiting 
		ob.get("http://www.google.com");
		
		//linktext: word/group of words=> click on new url will be opened
		//partial linktext: substring of linktext
		
		//code inspection is not needed
		//ob.findElementByLinkText("Privacy").click();
		
		ob.findElementByPartialLinkText("Pri").click();
		Thread.sleep(3000);
		ob.quit();
		
	}
}

package seleniumbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class zoomin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visiting 
		ob.get("http://www.facebook.com");
		
		//zoom in => greater than 100
		// zoom out=> less than 100
		// 100
		
		ob.executeScript("document.body.style.zoom='200%'");// zoom in
		Thread.sleep(3000);
		
		ob.executeScript("document.body.style.zoom='20%'");// zoom out
		
		Thread.sleep(3000);
		ob.executeScript("document.body.style.zoom='100%'");// nrml
		
		Thread.sleep(3000);
		
		ob.quit();
	}
}

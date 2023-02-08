package seleniumintro;

import org.openqa.selenium.chrome.ChromeDriver;

public class c1 {

	// right click=> properties=> java build path=> libraries
	//           classpath=> add external jar=> browser=> selenium jar 
	public static void main(String[] args) throws InterruptedException {
		//step1: conf chrome driver
		//step2:  creating an object for chromdriver class
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visiting 
		ob.get("http://www.facebook.com");
		
		// maximising
		//ob.manage().window().maximize();
		
		//fullscreen
		//ob.manage().window().fullscreen();
		
		//refreshing
		
		for(int i=0;i<3;i++)
		{
		ob.navigate().refresh();
		}
		
		// hold the page for certain seconds
		Thread.sleep(3000);
		
		// quit
		ob.quit();
		
		
	}
}

package seleniumexec;

import org.openqa.selenium.chrome.ChromeDriver;

public class e1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visiting 
		ob.get("http://www.facebook.com");
		System.out.println(ob.executeScript("return document.title"));
		System.out.println(ob.executeScript("return document.URL"));
		
		ob.quit();
	}
}

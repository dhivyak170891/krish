package seleniumcookies;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;

public class g1 {
	public static void main(String[] args) {
		
		//coookies : temporary information stored by the browser
		//set
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
		ChromeDriver ob= new ChromeDriver();
		//visiting 
		ob.get("http://www.facebook.com");
		Set<Cookie> c = ob.manage().getCookies();
		System.out.println("Number of cookies "+ c.size());
		
		// fetch cookie details
		// iterate through the set
		for(Cookie x:c)
		{
			System.out.println("Name is "+ x.getName());
			System.out.println("Value is "+ x.getValue());
			System.out.println("Expiry date is "+ x.getExpiry());
		}
		
		ob.quit();
	}

}

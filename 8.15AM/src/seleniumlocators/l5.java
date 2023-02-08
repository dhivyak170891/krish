package seleniumlocators;

import org.openqa.selenium.chrome.ChromeDriver;

public class l5 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	//visiting 
	ob.get("http://www.mycontactform.com");
	//xpath=> xml path language
	
	/*
	 * absolute xpath:  start finding the element from the root
	 *                  starts with /
	 *                  copy=> copy full xpath
	 *                  /html/body/div[3]/div[2]/div[1]/form/fieldset/div[1]/input
	 * 
	 * relative xpath:  starts with //
	 *  
	 *                 manual   : //*[@loc/attribute='value']
	 *                 shortcut : copy=> copy xpath
	 *                 
	 * 
	 * */
	//syntax: //*[@loc/attribute='value']
	
	//locator : id=user
	ob.findElementByXPath("//*[@id='user']").sendKeys("Dhivyakarthi123");
	
	//attribute: type=password
	ob.findElementByXPath("//*[@type='password']").sendKeys("12345");
	
	//shortcut: copy=> copy xpath
	//ob.findElementByXPath("//*[@id=\"right_col_top\"]/form/div/input").click();
	
	//absolute xpath:  copy=> copy fullxpath
	ob.findElementByXPath("/html/body/div[3]/div[2]/div[1]/form/div/input").click();
	
}
}

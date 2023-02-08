package seleniumbuttons;

import org.openqa.selenium.chrome.ChromeDriver;

public class datpicker {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver ob= new ChromeDriver();
	//visiting 
	ob.get("https://jqueryui.com/datepicker/");
	ob.switchTo().frame(0);
	
	// click on date text box
	ob.findElementById("datepicker").click();
	
	// march 2023
	for(int i=0;i<2;i++)
	{
	ob.findElementByXPath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span").click();
	}
	
	ob.executeScript("window.scrollBy(0,200)");
	// date selection
	ob.findElementByCssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(2) > td:nth-child(1) > a").click();
}
}

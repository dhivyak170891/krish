package seleniumnav;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nav {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Desktop\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
    driver.get("http:\\www.google.com");
    driver.manage().window().maximize();
    
   //open seleniumeasy.com in new tab   
 driver.executeScript("window.open('https://www.seleniumeasy.com','_blank');");
 
 //step2:
 // get the control of first tab:  driver.getwindowhandle()=>  parent
 // get the control of both tabs:  driver.getwindowhandles() => s1={google.com, seleniumeeasy.com
 String parent=driver.getWindowHandle();// control will be in the parent window //google
 // collecting all the handle
  Set<String> s1 = driver.getWindowHandles();// 2(both the tabs = collected)
  
  
  
 // iterate through the elements present in set
 
  Iterator<String> I1 = s1.iterator();  // hasNext , next()

  // hasnext=> whether content is there
  // next -> read the content 
  
 
 while(I1.hasNext())// whether any content is there 
    {
      String child_window=I1.next();
      if(!parent.equals(child_window))// picking the seleniumeasy.com
    	  { // control is moved to child window 
        driver.switchTo().window(child_window);
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.findElementByLinkText("Maven").click();
        Thread.sleep(4000);
        driver.close();
      }
      /*parent= google
       * s1={google.com, seleniumeasy.com}
       * 
       * first iteration:  I1 points to the first element in the set
       * I1.hasnext-> 
       *      I1.next() reads google.com and store it in child_window
       *      child_window=google.com
       *      if parent!=child_window
       *         google!=google
       *         
       *       terminate
       *       
       *second iteration:  I1 points to the second element in the set
       * I1.hasnext=>
       *      I1.next() reads seleniumeasy.com and store it in child_window
       *      child_window=seleniumeasy.com
       *      if parent!=child_window
       *      google!=seleniumeasy.com
       *          switiching control to child_window
       *          moving cursor to seleniumeasy.com
       *          Maven-> click
       *          quit: all the tabs will be closed
       *          close: close the tab which is in focus
       *          seleniumeasy.com will be closed
       *          
        third iteration: I1 points to null
        I1.hasnext=> nothin s there.. while loop terminate 
       * 
       *     
       *     switching control back to parent
       *     google
       *     title
       *     Images click
       *     close 
      * 
       * */
     
    
  }

    driver.switchTo().window(parent);//google 
    System.out.println(driver.getTitle());// google
    //driver.findElement(By.linkText("Images")).click();
    Thread.sleep(5000);
    driver.findElementByLinkText("Images").click();
    Thread.sleep(5000);
    driver.quit();
}
}



 






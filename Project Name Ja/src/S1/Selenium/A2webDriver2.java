package S1.Selenium;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class A2webDriver2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/"); 
		//"C:\Users\003pr\Downloads\chromedriver_win32"
		//"C:\Users\003pr\Downloads\chromedriver_win32"
		
		
		//"C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\"
		
		Thread.sleep(3000);
		
		
	    String URL = driver.getCurrentUrl();
	    System.out.println(URL);
	    
	    String expURL = "https://www.facebook.com/";
	      
	      if(URL.equalsIgnoreCase(expURL)) {
	    	  System.out.println("Navigate to correct page");
	      }
	    	  else {
	    		  System.out.println("Navigate to wrong page");
	    	  }
	}

}

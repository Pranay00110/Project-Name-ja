package S1.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1webDriver {
	
		
		
	public static void main(String[] args) throws InterruptedException{
		
	//System.setProperty("webdriver.chrome.driver","C:\Users\003pr\Downloads\chromedriver_win32\chromedriver.exe");
			
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
			WebDriver driver = new ChromeDriver();      // upcasting // driver is reference variable
	       //driver.get("https://www.facebook.com/r.php");
			driver.get("https://www.facebook.com/");    // To launch the URL & nevigate to the page
	       // Thread.sleep(3000);
	        //driver.close();    // to close only one single tab
	        //driver.quit();     // to close whole browser
	        
	      String title =  driver.getTitle();
	      System.out.println(title);  // actual title
	      
	      String expTitle = "signup for facebook";
	      
	      if(title.equalsIgnoreCase(expTitle)) {
	    	  System.out.println("Navigate to correct page");
	      }
	    	  else {
	    		  System.out.println("Navigate to wrong page");
	    	  }
	      
	      driver.switchTo().newWindow(WindowType.TAB);
	      driver.get("https://www.facebook.com/");
	      
	     // driver.close();
	      driver.quit();
	      }
	}






package S1.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class F2ScreenShot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/signup"); 
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
       //File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
    
      //File destination = new File("C:\\Users\\003pr\\OneDrive\\Pictures\\My screenshot\\Text01"+timestamp+".JPEG");
    //  FileHandler.copy(src, destination);
      
      Calendar cal = Calendar.getInstance();
      Date time = cal.getTime();
      
      String timestamp = time.toString().replace(":", "").replace(" ", "");
      
      System.out.println(time);
      System.out.println(timestamp);
      
      File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
      //C:\Users\003pr\OneDrive\Pictures\My screenshot 
      File destination = new File("C:\\Users\\003pr\\OneDrive\\Pictures\\My screenshot 1\\Text01"+timestamp+".JPEG");
      FileHandler.copy(src, destination);
      
      
	}
	

}
	
	

//}

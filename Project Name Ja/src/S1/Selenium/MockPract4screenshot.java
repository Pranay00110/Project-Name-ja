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

import net.bytebuddy.utility.RandomString;

public class MockPract4screenshot {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/signup"); 
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
      Calendar cal = Calendar.getInstance();
      Date time = cal.getTime();
      
      String timestamp = time.toString().replace(":", "").replace(" ", "");
      
      System.out.println(time);
      System.out.println(timestamp);
     
      for(int i=10; i>=1;i--) {

      
      File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		    	  
      String random = RandomString.make();
      
      File destination = new File("C:\\Users\\003pr\\OneDrive\\Pictures\\My screenshot 1\\Text01"+random+".JPEG");
      FileHandler.copy(src, destination);
      

}
      
	}
	

}
	



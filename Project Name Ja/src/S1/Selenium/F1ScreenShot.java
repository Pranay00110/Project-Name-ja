package S1.Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class F1ScreenShot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/signup"); 
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
       File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
    
      File destination = new File("C:\\Users\\003pr\\OneDrive\\Pictures\\My screenshot\\Text01.JPEG");
      FileHandler.copy(src, destination);
	}
	

}

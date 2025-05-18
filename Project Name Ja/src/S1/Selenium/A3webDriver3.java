package S1.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3webDriver3 {
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/"); 
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.manage().window().minimize();
		Thread.sleep(3000);

}
}
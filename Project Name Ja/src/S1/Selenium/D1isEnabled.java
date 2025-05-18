package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1isEnabled {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/signup"); 
		
	boolean result = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	
	System.out.println(result);  // true or false
	
	// need to validate element is enabled or not
	
	if(result==true) {
		System.out.println("element is enabled");
	}
	else {
		System.out.println("element is disable or not enabled");
	}
		
	}

}

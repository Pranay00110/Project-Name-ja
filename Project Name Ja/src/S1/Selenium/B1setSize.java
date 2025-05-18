package S1.Selenium;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1setSize {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.amazon.in/"); 
		Thread.sleep(3000);
		
		Dimension d = new Dimension (200, 400);    // pixels
		
		driver.manage().window().setSize (d) ;
	
}
}
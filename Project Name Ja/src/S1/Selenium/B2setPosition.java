package S1.Selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2setPosition {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.amazon.in/"); 
		Thread.sleep(3000);
		
		Point p = new Point(200,400);
		driver.manage().window().setPosition(p);

}
}
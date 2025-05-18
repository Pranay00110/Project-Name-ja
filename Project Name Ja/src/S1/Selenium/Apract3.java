package S1.Selenium;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apract3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.instagram.com/");
        
        Thread.sleep(2000);
        
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        
        driver.close();
        Thread.sleep(2000);
        
        WebDriver driver1 = new ChromeDriver();
        
        driver1.switchTo().newWindow(WindowType.TAB);
        driver1.get("https://www.flipkart.com");
        Thread.sleep(3000);
        driver1.close();
        Thread.sleep(2000);
        driver1.quit();
	}

}

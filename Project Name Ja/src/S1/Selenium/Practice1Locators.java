package S1.Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1Locators{
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        WebDriver driver = new  ChromeDriver();
        driver.get("https://www.facebook.com/login/");
        
        Thread.sleep(2000);
        driver.manage().window().maximize();
        
        Thread.sleep(2000);
        driver.navigate().to("https://www.youtube.com/");
        Thread.sleep(2000);
        driver.manage().window().minimize();
        Thread.sleep(2000);
        
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(2000);
        driver.get("https://www.youtube.com/watch?v=g6fnFALEseI");
        Thread.sleep(2000);
        
        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();
        
        Point p = new Point(100,300);
        driver.manage().window().setPosition(p);
        
        Dimension s = new Dimension(200,230);
        driver.manage().window().setSize(s);
        

	}

}

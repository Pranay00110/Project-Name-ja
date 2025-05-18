package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

public class Practice3Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/signup");
        
        Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("virat");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kohli");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9012854039");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("odhdsb51e2d");
		Thread.sleep(2000);
		
		
//1		
	
	 WebElement x = driver.findElement(By.xpath("//select[@aria-label='Day']"));
	 
	 Select ele = new Select (x);
     ele.selectByVisibleText("5");
     Thread.sleep(2000);
     
 //2
     
   WebElement y = driver.findElement(By.xpath("//*[@id=\\\"month\\\"]"));
   
   Select ele1 = new Select (y);
   ele1.selectByVisibleText("Feb");
   Thread.sleep(2000);
   
  
 //3
   
   WebElement z = driver.findElement(By.xpath("//*[@id=\\\"year\\\"]"));
   
   Select ele2 = new Select (z);
   ele2.selectByVisibleText("1988");
   Thread.sleep(2000);     
        
	
	}
}

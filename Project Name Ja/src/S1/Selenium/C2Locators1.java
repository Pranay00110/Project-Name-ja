package S1.Selenium;

import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C2Locators1 {
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/signup"); 
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@ type='text'])[1]")).sendKeys("karan");
		Thread.sleep(2000);


		driver.findElement(By.xpath("(//input[@ type='text'])[2]")).sendKeys("Johar");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("(//input[@ type='text'])[3]")).sendKeys("9102568745");
		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@ type='password']")).sendKeys("dbdqlhdn");
		Thread.sleep(2000);
		
		WebElement x = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		
		Select ele = new Select (x);
		//ele.selectByIndex(10);
		//ele.selectByValue("10");
		ele.selectByVisibleText("3");
		
		Thread.sleep(2000);

		
       // WebElement y = driver.findElement(By.xpath("//select[@name='birthday_day']"));         Relative X-Path
        WebElement y = driver.findElement(By.xpath("//*[@id=\"month\"]"));                      // Absulate X-Path
      //*[@id="month"]

      //*[@id="month"]   Relative x path
        
		Select ele1 = new Select (y);
		//ele.selectByIndex(10);
		//ele.selectByValue("Nov");
		ele1.selectByVisibleText("Nov");
		
		Thread.sleep(2000);
		
       // WebElement z = driver.findElement(By.xpath("//select[@name='birthday_year']"));         Relative X-Path
        WebElement z = driver.findElement(By.xpath("//*[@id=\"year\"]"));                       // Absulate X-Path
      //*[@id="year"]
        
		Select ele2 = new Select (z);
		//ele.selectByIndex(10);
		//ele.selectByValue("10");
		ele2.selectByVisibleText("2022");
		
}
}
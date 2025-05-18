package S1.Selenium;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


public class C1Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/"); 

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
//		WebDriverWait ref = new WebDriverWait (driver, Duration.ofSeconds(3));
//		WebElement re = ref.until(ExpectedCondition.visibilityofElementLocated(By.xpath("kdjjdi")));
		
		
		driver.findElement(By.xpath("(//input[@ autocorrect='off'])[1]")).sendKeys("pra123");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@ autocorrect='off'])[2]")).sendKeys("145602");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@ type='button']")).click();
	
		//***********************MAY BE POPUP***********************************************************************\\
	}

}

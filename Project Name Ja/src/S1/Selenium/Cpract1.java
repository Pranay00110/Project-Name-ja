package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cpract1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("5555555");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(// input[@ autocomplete = 'off'])[3]")).sendKeys("paa520");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[contains (@ type, 'submit')])[2]")).click();
		Thread.sleep(2000);
		
	}

}

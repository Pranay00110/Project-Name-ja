package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cpract2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/sem/campaign/emailsignup/");
		
		Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@autocomplete,'tel')]")).sendKeys("pran@5050");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[contains(@ aria-label , 'Full Name')]")).sendKeys("Pranay Ajay Atambar");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[contains(@ aria-label , 'Username')]")).sendKeys("pra2010");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("508061");
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("(//button[contains(@class,'sqdOP  L3NKy   y3zKF     ')])[2]")).click();
        Thread.sleep(2000);
        
		
	}

}

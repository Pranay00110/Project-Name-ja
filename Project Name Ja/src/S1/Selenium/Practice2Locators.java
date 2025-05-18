package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
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
		
		//****************************With the help of x-path This is not valid*****************************
		
		driver.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("20");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("Jan");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//select[@name='birthday_year']")).sendKeys("2000");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.navigate().forward();
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.close();
		Thread.sleep(2000);
		driver.quit();
	
}

}

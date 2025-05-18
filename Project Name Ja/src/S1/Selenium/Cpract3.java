package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cpract3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		// 9326010465
		// 9623363031
		// 9356020961
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("Sunny");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Deol");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]")).sendKeys("9051200354");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("555555");
		Thread.sleep(2000);
		
		WebElement x = driver.findElement(By.xpath("//select[contains(@aria-label,'Day')]"));
		Select ele = new Select(x);
		ele.selectByVisibleText("22");
		Thread.sleep(2000);
		
		 WebElement y = driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
		Select ele1 =new Select(y);
		ele1.selectByVisibleText("Dec");
		Thread.sleep(2000);
		
		WebElement z = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select ele2 = new Select (z);
		ele2.selectByVisibleText("1988");
		Thread.sleep(2000);
		
		
	}

}

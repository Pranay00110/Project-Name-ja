package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cpract4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/signup");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input [@type='text']")).sendKeys("Manoj");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Ghuge");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("9999999999");
		driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("oifghjk");
		
		 WebElement x = driver.findElement(By.xpath("(//select[contains(@name,'birthday')])[1]"));
		 Select ele=new Select (x);
		 ele.selectByValue("3");
		 
		WebElement y = driver.findElement(By.xpath("(//select[contains(@name,'birthday')])[2]"));
		Select ele1=new Select(y);
		ele1.selectByVisibleText("May");
		
		WebElement z = driver.findElement(By.xpath("(//select[contains(@name,'birthday')])[3]"));
		Select ele2=new Select(z);
        ele2.selectByValue("2000");
        
        WebElement radioButton = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
        radioButton.click();		
		
        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	}

}

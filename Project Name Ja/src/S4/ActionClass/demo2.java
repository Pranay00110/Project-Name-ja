package S4.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo2 {
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//"C:\Users\003pr\Downloads\chromedriver_win32\chromedriver.exe"
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2kpz61_2doB4z']")).click();
		Thread.sleep(2000);
		
		WebElement amt = driver.findElement(By.xpath("//a[class='button button-orange'])[2]"));
		
		WebElement place = driver.findElement(By.xpath("//li[class='placeholder'])[4]"));
		
		Actions a = new Actions (driver);
		a.moveToElement(amt).perform();
		
		a.moveToElement(amt).clickAndHold().moveToElement(place).release().build().perform();
		a.dragAndDrop(amt, place).perform();

}
}
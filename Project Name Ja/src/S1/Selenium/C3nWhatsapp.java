package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C3nWhatsapp {
	
public static void main(String[] args) throws InterruptedException {        
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://web.whatsapp.com/"); 
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("// p[@class='selectable-text copyable-text']")).sendKeys("hii pranay");
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("// span[@data-icon='send']")).click();


}
}
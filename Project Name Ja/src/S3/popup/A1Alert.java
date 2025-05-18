package S3.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		Thread.sleep(2000);
		
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
	}

}

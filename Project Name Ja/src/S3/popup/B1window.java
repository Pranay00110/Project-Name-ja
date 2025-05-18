package S3.popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1window {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='NewTab']"));
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(ids);
		
		String child = al.get(2);  // get address of child window
		
		driver.switchTo().window(child);  // focus to on child window
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Trining'])[1]")).click();
		
		
		driver.switchTo().window(al.get(0));   // focus is change to main window
		
		driver.findElement(By.xpath("(//input[name='NewWindow']")).click();
		
	}

}

package S1.Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bpract1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.instagram.com/r.php");
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		Dimension d = new Dimension(200,600);
		driver.manage().window().setSize(d);
		
	}
}

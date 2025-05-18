package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockPract3isEnabled {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	    WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/signup");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		boolean result = driver.findElement(By.xpath("(//input[@ type = 'text'])[1]")).isEnabled();
		
		System.out.println(result);
		
		if(result==true) {
			System.out.println("method is enabled");
		}
		else {
			System.out.println("method is disenbled");
		}
	}

}

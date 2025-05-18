package S1.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockPract1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromeDriver.exe\\");
		WebDriver driver = new ChromeDriver(); 
		driver.navigate().to("https://www.myntra.com");
		
		Thread.sleep(3000);
		
		driver.get("https://www.myntra.com/shop/kids");
		
		Thread.sleep(3000);

		driver.navigate().forward();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		
		Thread.sleep(3000);
        driver.navigate().refresh();
	
	}

}

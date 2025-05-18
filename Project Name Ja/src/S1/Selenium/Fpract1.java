package S1.Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Fpract1 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("C:\\Users\\003pr\\OneDrive\\Pictures\\My screenshot 1\\IMG01.JPEG");
				
		FileHandler.copy(src, destination);		
	}

}

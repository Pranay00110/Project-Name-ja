package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dpract1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		//"C:\Users\003pr\Downloads\chromedriver_win32\chromedriver.exe"
		//C:\Users\003pr\Downloads\chromedriver_win32 (1)
		boolean result = driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).isEnabled();
		System.out.println(result);
		
		//validate it is true or false
		
		if(result==true) {
			System.out.println("element is enable");
		}
		else {
			System.out.println("element is disable or not enable");
		}
		
	}

}

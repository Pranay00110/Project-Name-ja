package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D2getText {
	
public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/signup"); 
		
		WebElement text = driver.findElement(By.xpath("//select[@aria-label='Year']"));
	String result = text.getAttribute("name");
	System.out.println(result);
	
	///////////////////////////////print in console is null////////////////////
	
	}

}



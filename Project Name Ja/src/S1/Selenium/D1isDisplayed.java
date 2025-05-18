package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1isDisplayed {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/signup"); 
		
		WebElement display = driver.findElement(By.xpath("(//input[@type='text'])[6]"));
		boolean result = display.isDisplayed();
		
		System.out.println(result);
		
		if(result==true) {
			 System.out.println("element is Displayed");
		 }
		 else {
			 System.out.println("element is not Displayed");
		 }
		
	}

}

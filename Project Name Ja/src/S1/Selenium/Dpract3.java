package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dpract3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
	    WebElement display = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	    display.click();
	    boolean result = display.isDisplayed();
	    System.out.println(result);
	    
	    if(result==true) {
	    	System.out.println("element is displayed");
	    }
	    else {
	    	System.out.println("element is not displayed");
	    }
	}

}

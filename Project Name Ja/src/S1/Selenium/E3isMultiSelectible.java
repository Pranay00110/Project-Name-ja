package S1.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E3isMultiSelectible {
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/signup"); 
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));

		
		Select ele = new Select(year);
	boolean result = ele.isMultiple();
	System.out.println(result);
	
	if(result==true) {
		System.out.println("Listbox is multiselectible");
	}
	else {
		System.out.println("Listbox is not multiselectible");
	}
	     
	}


}

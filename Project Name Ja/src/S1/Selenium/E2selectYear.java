package S1.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class E2selectYear {
	
public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/signup"); 
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));

		
		Select ele = new Select(year);
	     List<WebElement> options	= ele.getOptions();
	     //System.out.println(options);
	     
	     int size = options.size();
	     System.out.println("List box size is:");
	     
	     for(int i=0;i<options.size()-1;i++) {
	    	 System.out.println(options.get(i).getText());
	     }
		
	}


}

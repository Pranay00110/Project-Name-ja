package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1isSelected {
	
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");  // class.methodName  Static method
		WebDriver driver = new ChromeDriver();  
		driver.get("https://www.facebook.com/signup"); 
		
		WebElement female = driver.findElement(By.xpath("//label[@class='_58mt']"));
		 
		 female.click();
		 boolean result = female.isSelected();
		 
		 if(result==true) {
			 System.out.println("element is selected");
		 }
		 else {
			 System.out.println("element is not selected");
		 }
		 
		
	}

}

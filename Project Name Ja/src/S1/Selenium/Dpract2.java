package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dpract2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		WebElement female = driver.findElement(By.xpath("//span [@class='_5k_2 _5dba']")); // false
	// true	WebElement female = driver.findElement(By.xpath("//input [@type='radio']"));   // true
		female.click();
		boolean result = female.isSelected();
		System.out.println(result);
		
		if(result==true) {
			System.out.println("element is selected");
		}
		else {
			System.out.println("element is not selected");
		}
		
	}

}

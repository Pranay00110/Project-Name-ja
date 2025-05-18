package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Epract2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement year = driver.findElement(By.xpath(""));
		Select ele = new Select (year);
		boolean result = ele.isMultiple();
		System.out.println(result);
		
		if (result==true) {
			System.out.println("Listbox is not multiselectable");
		} 
		else 
		{
        System.out.println("Listbox is multiselectable");
		}
		
	}

}

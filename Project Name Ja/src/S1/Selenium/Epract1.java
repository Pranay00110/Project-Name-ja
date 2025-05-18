package S1.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Epract1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("https://www.facebook.com/signup");
		
		WebElement year = driver.findElement(By.xpath(""));
		Select ele = new Select (year);
		List<WebElement> option = ele.getOptions();
		System.out.println(option);
		
		int siz = option.size();
		System.out.println(siz);
		
	}

}

package S1.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dpract4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		WebElement text = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		String result = text.getText();
		//String att = text.getAttribute("name");
		//System.out.println(att);
		System.out.println(result);
		
	}

}

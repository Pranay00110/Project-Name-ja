package scroll;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,2000)");  //scroll down
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-2000)");  //scroll up
		Thread.sleep(2000);
		
		
		
	}

}

package S3.popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2Alert {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='prompt']")).click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        
        alt.sendKeys("pranay");
        alt.dismiss();
		
	}

}
//shivanand dhorvekar & vinod kamle
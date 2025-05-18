package S3.popup;

//import org.openqa.selenium.By;    
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C1iframe {
	
	public static void main(String[] args) throws InterruptedException  {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		Thread.sleep(2000);
		
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		 //driver.switchTo().frame(iframe);  // change focus iframe to main page
		 
		// driver.findElement(By.xpath("//button[@type='button']")).click();
		 
		//Thread.sleep(2000);
		 
		// driver.switchTo().defaultContent();  // change to focus from iframe to main page
		//driver.switchTo().parentFrame();
		 
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[@id='tryhome'")).click();
		
	}

}

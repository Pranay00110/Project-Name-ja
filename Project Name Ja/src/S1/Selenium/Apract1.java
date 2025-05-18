package S1.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apract1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.facebook.com/");
		//driver.get("https://www.facebook.com/r.php");		
		
		
		String title = driver.getTitle();
		System.out.println(title);   // actual title
		
		String expTitle = "login for facebook";
		
		
		if(title.equalsIgnoreCase(expTitle)) {
			System.out.println("Navigate to correct page");
		}
		else {
			System.out.println("Navigate to wrong page");
		}
		
	}

}

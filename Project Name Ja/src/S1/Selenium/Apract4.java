package S1.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apract4 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();		
		System.out.println(title);
		
	    String expTitle="signup for login page";
		
		if(title.equalsIgnoreCase(expTitle)) {
			System.out.println("nevigate to correct page");
		}
		else {
			System.out.println("nevigate to wrong page");
		}
		
	}

}

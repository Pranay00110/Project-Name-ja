package S1.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apract2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\003pr\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com/");

		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String expURL ="https://google.com/";
		
		if(URL.equalsIgnoreCase(expURL)) {
			System.out.println("Navigate to correct URL");
		}
		else {
			System.out.println("Navigate to wrong URL");
		}
		
	}

}

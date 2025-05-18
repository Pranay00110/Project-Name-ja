package seleniumPractise;

import org.apache.batik.svggen.font.Point;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", null);
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
		Thread.sleep(3000);
		
		String title = driver.getTitle();
		System.out.println(title); // Actual result
		
		String expTitle = "Sign up for login page";
		
		if (title.equalsIgnoreCase(expTitle)) {
			System.out.println("Navigate to correct page");
		}
		else {
			System.out.println("Navigate to wrong page");
		}
		
		//************************************************************8
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL); // Actual current URL
		
		String ExpUrl = "https://www.facebook.com/";
		
		if(URL.equalsIgnoreCase(ExpUrl)) {
			System.out.println("Navigate to correct page");
		}
		else {
			System.out.println("Navigate to wrong page");
		}
		
		
		//**************************************************************
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.quit();  // close all tab or whole browser
		driver.close();  // close current tab or single tab
		
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		
		//**********************************************************
		
		
		Dimension d = new Dimension (200,400);
		driver.manage().window().setSize(d);
		
		//********************************************************************88
		
		Point p = new point (200,200);
		driver.manage().window().setPosition(p);
		
		
	}

}

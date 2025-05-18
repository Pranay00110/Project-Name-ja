package S1.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class G6printcell {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
		Calendar cal= Calendar.getInstance();
		Date time = cal.getTime();
		String timestamp = time.toString().replace(":","").replace(" ","");
		System.out.println(time);
		System.out.println(timestamp);
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("");
		
		FileHandler.copy(src, destination);
		
	}

}

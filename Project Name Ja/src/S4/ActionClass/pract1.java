package S4.ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class pract1 {
	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		WebElement electronics = driver.findElement(By.xpath("//img[@alt='Electronics']"));		
		Actions a= new Actions(driver);
		a.moveToElement(electronics).perform();
		
		WebElement earBuds = driver.findElement(By.xpath("/html/body/div[4]/div[2]/object/a[4]"));
		a.click(earBuds).perform();
		
		
		
	}

}

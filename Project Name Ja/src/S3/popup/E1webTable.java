package S3.popup;

	
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class E1webTable {
		
		public static void main(String[] args) throws InterruptedException {
		//	System.setProperty("webdriver.chrome.driver","C:\\Users\\yadav\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver(); // upcasting
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			List<WebElement> noofRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
			
			//total number of rows present in table
			
			System.out.println("No of Rows = "+noofRows.size());
			
			for(int i =1;i<noofRows.size();i++) {
				List<WebElement> noofCells = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
				//System.out.println(noofCells.size());
				
				for(int cell =0;cell<noofCells.size();cell++) {
					System.out.print(noofCells.get(cell).getText()+",  ");
					
				}
				System.out.println();
				
			}
			
			
			
			

	}
	}

//}

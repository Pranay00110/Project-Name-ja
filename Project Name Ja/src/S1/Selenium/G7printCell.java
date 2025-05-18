package S1.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class G7printCell {
	
	public static void main(String[] args, Object WorkbookFactory) throws FileNotFoundException {
		
		//D:\PranayD
		FileInputStream file=new FileInputStream("D:\\PranayD");
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow().getCell().getStringValue();
		//WorkbookFactory.create(file).getSheet("Sheet1").getCell().getRow().getSt
		
	}

}

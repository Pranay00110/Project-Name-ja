package S2.seleniumParameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A2stringValue {
	
	public static void main(String[] args) throws IllegalStateException, IOException    {
		
		//FileInputStream file = new FileInputStream 		("C:\\Users\\003pr\\OneDrive\\Documents\\Pranay\\Selen Parameterization practise.xlsx");
		FileInputStream file = new FileInputStream("D:\\PranayD\\Selen Parameterization practise.xlsx");
		
	String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
	
	System.err.println(data);
	}

}

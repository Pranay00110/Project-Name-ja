package S2.seleniumParameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A6pract {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file= new FileInputStream("D:\\PranayD\\Selen Parameterization practise.xlsx");
		
		String a = WorkbookFactory.create(file).getSheet("Sheet1").getRow(8).getCell(2).getStringCellValue();
		System.out.println(a);
		
	}

}

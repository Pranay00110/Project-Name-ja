package S2.seleniumParameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class A3stringValue {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\003pr\\OneDrive\\Documents\\Pranay\\Selen Parameterization practise.xlsx");
		
		boolean data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(2).getBooleanCellValue();
	
	System.err.println(data);
	}

}

package S1.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class G5printDataUsingCT {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Users\\003pr\\OneDrive\\Documents\\Pranay\\Selen Parameterization practise.xlsx");
	
	  Cell cellInfo = WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1);
	
	CellType CT = cellInfo.getCellType();  // string or boolean or numeric
	
	if(CT==CellType.STRING) {
		System.out.println(cellInfo.getStringCellValue());
	}
	else if (CT==CellType.BOOLEAN) {
		System.out.println(cellInfo.getBooleanCellValue());
	}
	else if (CT==CellType.NUMERIC) {
		System.out.println(cellInfo.getNumericCellValue());
	}
	}

}

package S1.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class G1print1Cell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException   {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\003pr\\OneDrive\\Documents\\Pranay\\Selen Parameterization practise.xlsx");

        Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
	
        int LastRowIndex = sh.getLastRowNum();
        
        
        for(int i = 0; i<=LastRowIndex; i++) {
        	
        String data = sh.getRow(i).getCell(0).getStringCellValue();
        
        System.out.println(data);
        }
	}
}

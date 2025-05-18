package S1.Selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class G3printRowCell {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("C:\\Users\\003pr\\OneDrive\\Documents\\Pranay\\Selen Parameterization practise.xlsx");
	
	    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
	
        short cellSize = sh.getRow(0).getLastCellNum();

        System.out.println(cellSize);

        for(int i=0; i<=cellSize;i++) {
        	
        	String data = sh.getRow(0).getCell(i).getStringCellValue();
        	
        	System.out.println(data+" ");
        }
	
	}

}

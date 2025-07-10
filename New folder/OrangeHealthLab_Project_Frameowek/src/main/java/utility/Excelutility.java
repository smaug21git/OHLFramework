package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelutility {
	
	public static String readDataFromExcel(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream("./appium.xlsx");
		String data = WorkbookFactory.create(fis).getSheet(sheetName).getRow(rowNum).getCell(cellNum).toString();
		return data;
	}

}

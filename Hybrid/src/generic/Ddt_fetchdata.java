package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ddt_fetchdata 
{
public static String getData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	String val="";
	try {
		FileInputStream fis = new FileInputStream("./File/seleniumtestdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		val=c.getStringCellValue();
	} 
	catch (FileNotFoundException e) 
	{
		System.out.println("unable to fetch data");
		e.printStackTrace();
	}
	
return val;	
}
}

package GenricUtilityorLib;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericMethodTowriteData
{	
public void WriteDataInExcel(String sheetName, int rownum,int cellnum,String value)throws Exception                                                                 
{
	FileInputStream fis = new FileInputStream(Iconstantutility.excelPath);
	Workbook book =WorkbookFactory.create(fis);
	Sheet sh = book.getSheet(sheetName);
	sh.createRow(rownum).createCell(cellnum).setCellValue(value);
	FileOutputStream fos =new FileOutputStream(Iconstantutility.excelPath);
	book.write(fos);
	
	
	
}
}

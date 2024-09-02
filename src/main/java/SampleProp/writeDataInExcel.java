package SampleProp;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import GenricUtilityorLib.Iconstantutility;

public class writeDataInExcel {
public static void main(String[] args)throws Exception
{
	FileInputStream fis = new FileInputStream(Iconstantutility.excelPath);
	Workbook book = WorkbookFactory.create(fis);
	Sheet sh= book.getSheet("sheet1");
	sh.createRow(9).createCell(1).setCellValue("angrybird");
	FileOutputStream fos =new FileOutputStream(Iconstantutility.excelPath);
	book.write(fos);
	
	
}
}

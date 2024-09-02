package SampleProp;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SampleExcelIndividualData {
public static void main(String[] args)  throws Exception{
FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\selenium\\A4testdata.xlsx");

Workbook book = WorkbookFactory.create(fis);
Sheet sh= book.getSheet("sheet1");
DataFormatter format =new DataFormatter();

String value = format.formatCellValue(sh.getRow(2).getCell(4));
System.out.println(value);
}
}

package qsp;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExel {
public static void main(String[] args) throws Throwable {
	FileInputStream fis = new FileInputStream("./TestData/ActitimeTestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	System.out.println(value);
}
}

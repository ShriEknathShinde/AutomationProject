//write a script to do Update the data in exel sheet.
package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataExel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./Testdata/ActitimeTestData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("PUB_001");
	FileOutputStream fos = new FileOutputStream("./Testdata/ActitimeTestData.xlsx");
	wb.write(fos);
}
}
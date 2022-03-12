package autopro;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class writedatatosheet {
	
	@Test
	public void writedata() throws Throwable, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\user\\OneDrive\\Desktop\\testdoc.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		
		//write value in the exiting sheet in new row
		wb.getSheet("test1").createRow(3).createCell(0).setCellValue("priyanka");
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\user\\OneDrive\\Desktop\\testdoc.xlsx");
		wb.write(fout);
		wb.getSheet("test1").getRow(3).createCell(1).setCellValue("priya123");
		wb.write(new FileOutputStream("C:\\Users\\user\\OneDrive\\Desktop\\testdoc.xlsx"));
		
	}

	
}

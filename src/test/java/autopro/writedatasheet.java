package autopro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class writedatasheet {
	
	@Test
	public void sheetdata() throws IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\user\\OneDrive\\Desktop\\testdoc.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		wb.createSheet("newSheet").createRow(0).createCell(0).setCellValue("username");
		wb.getSheet("newSheet").getRow(0).createCell(1).setCellValue("password");
		wb.write(new FileOutputStream("C:\\Users\\user\\OneDrive\\Desktop\\testdoc.xlsx"));
	}

}

package autopro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class readFromExcel {
	
	@Test
	public void readdata() throws Throwable
	{
		FileInputStream file = new FileInputStream("C:\\Users\\user\\OneDrive\\Desktop\\testdoc.xlsx");
		Workbook wb = WorkbookFactory.create(file);
		String un1= wb.getSheet("test1").getRow(1).getCell(0).getStringCellValue();
		System.out.println("username==>"+un1);
		String password1 = wb.getSheet("test1").getRow(1).getCell(1).getStringCellValue();
		System .out.println("password"+password1);
		String un2 = wb.getSheet("test1").getRow(2).getCell(0).getStringCellValue();
		System.out.println("username==>"+un2);
		String password2 = wb.getSheet("test1").getRow(2).getCell(1).getStringCellValue();
		System.out.println("password==>"+password2);
		
	}

}

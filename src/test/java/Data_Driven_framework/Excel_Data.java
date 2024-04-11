package Data_Driven_framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Data {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\dell\\Desktop\\Usercredentails.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet =wb.getSheet("Sheet1");
		int totalrow=sheet.getLastRowNum();
		int totalcell=sheet.getRow(1).getLastCellNum();
		
		System.out.println(totalrow);
		System.out.println(totalcell);
		
		for (int r = 0; r <= totalrow ; r++) {
			XSSFRow currentrow =sheet.getRow(r);
			for (int c = 0; c < totalcell; c++) {
				
				String value=currentrow.getCell(c).toString();
				System.out.println(value);
				
			}
			
		}

	}

}

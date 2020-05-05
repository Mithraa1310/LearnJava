package utils;



import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static String[][] readexcel() throws IOException {
		
		XSSFWorkbook wbook = new XSSFWorkbook("./data/createLead.xlsx");
		XSSFSheet wsheet=wbook.getSheetAt(0);
		
		int rowcount=wsheet.getLastRowNum();
		int colcount=wsheet.getRow(0).getLastCellNum();
		
		String[][] data=new String[rowcount][colcount];
		
		for(int j=1;j<=rowcount;j++)
		{
		XSSFRow row=wsheet.getRow(j);
		
		for (int i = 0; i < 3; i++) {
			
			XSSFCell cell = row.getCell(i);
			String value = cell.getStringCellValue();
			data[j-1][i]=value;
			System.out.println(value);
		}
		System.out.println();
		
		}wbook.close();
		return data;
		
		
	}

}

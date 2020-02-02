package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook wbook = new XSSFWorkbook("./data/TC001_CreateLead.xlsx");
		XSSFSheet wsheet = wbook.getSheetAt(0);
		short colcount = wsheet.getRow(0).getLastCellNum();
		int rowcount = wsheet.getLastRowNum();
		
		//for all the rows
		for(int i=1;i<=rowcount;i++) {
			XSSFRow row = wsheet.getRow(i);
			
			//for sll columns of each row
			for (int j=0; j<colcount;j++)
			{
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.print(value+" ");
			}
			
	System.out.println();
			
		}
		
	}

}

package com.indegene.files;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadExample {
	public static void main(String[] args) {
		try {
			File file = new File("./resources/employee.xlsx");
			FileInputStream fis = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fis);	// Reading EXCEL File
			XSSFSheet sheet = workbook.getSheetAt(0);	// Reading Sheet 1 from Excel File
			Iterator<Row> itr = sheet.iterator();		// Reading all rows from the Sheet 1
			while(itr.hasNext()) {	// read row 
				Row row = itr.next();
				Iterator<Cell> cellIterator = row.cellIterator();	// iterator over each element
				while(cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch(cell.getCellType()) {
						case Cell.CELL_TYPE_STRING:
							System.out.print(cell.getStringCellValue()+"\t\t");
							break;
						case Cell.CELL_TYPE_NUMERIC: 
							System.out.print((int)cell.getNumericCellValue()+"\t\t");
							break;
					}
				}
				System.out.println("");
			}
			workbook.close();
		}catch(Exception e) {
			System.err.println("Exception : "+e.toString());
		}
	}

}

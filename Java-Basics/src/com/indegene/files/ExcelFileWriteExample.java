package com.indegene.files;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileWriteExample {
	public static void main(String[] args) {
		try {
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("Java Books");
			Object[][] bookData = {
					{ "Book Title", "Author", "Price" },
					{ "Head First Java", "Kathy Serria", 79 },
					{ "Effective Java", "Joshua Bloch", 36 },
					{ "Clean Code", "Robert Martin", 42 },
					{ "Thinking in Java", "Bruce Eckel", 35 }
				};
			int rowCount = 0;	// Excel File Row Index
			for(Object[] aBook : bookData ) {
				Row row = sheet.createRow(rowCount);
				int columnCount = 0;	// Excel File Column Index
				for(Object field : aBook) {
					Cell cell = row.createCell(columnCount);
					if ( field instanceof String) {
						cell.setCellValue((String)field);
					} else if (field instanceof Integer) {
						cell.setCellValue((Integer)field);
					}
					columnCount++;
				}
				rowCount++;
			}
			FileOutputStream fos = new FileOutputStream("./resources/JavaBooks.xlsx");
			workbook.write(fos);
			workbook.close();
			System.out.println("Excel File created successfully");
		}catch(Exception e) {
			System.err.println("Exception : "+e.toString());
			//e.printStackTrace();
		}
	}
}

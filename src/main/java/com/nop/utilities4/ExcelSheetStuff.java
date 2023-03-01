package com.nop.utilities4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheetStuff {

	public static void main(String[] args) {
		FileInputStream fis;
		XSSFWorkbook wb = null;
		
		DataFormatter formater = new DataFormatter();
		String excelPath = System.getProperty("user.dir") + "\\ExcelFiles\\Book2.xlsx";

		try {
			fis = new FileInputStream(excelPath);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {

			e.printStackTrace();
		}

		int noOfSheets = wb.getNumberOfSheets();
		System.out.println(wb.getNumberOfSheets());
		XSSFSheet sh = null;
		int c = 0;
		for (int i = 0; i < noOfSheets; i++) {

			String shName = wb.getSheetAt(i).getSheetName();
			sh = wb.getSheetAt(i);

			if (shName.equalsIgnoreCase("logins")) {

				Iterator<Row> rowIt = sh.rowIterator();
				while (rowIt.hasNext()) {
					Row row = rowIt.next();

					Iterator<Cell> cellit = row.cellIterator();

					while (cellit.hasNext()) {
						Cell cell = cellit.next();
						String Finalval = formater.formatCellValue(cell).trim();
						
					}
					System.out.println();
				}

			}

		}
		

	}

}

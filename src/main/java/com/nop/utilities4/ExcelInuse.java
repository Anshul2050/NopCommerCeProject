package com.nop.utilities4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelInuse {

	@Test(dataProvider = "dp")
	public void test(String name, String pwd) {
		System.out.println(name + " " + pwd);

	}

	@DataProvider(name = "dp")
	public Object[][] readDataNop() {
		FileInputStream fis;
		XSSFWorkbook wb = null;

		DataFormatter formatter = new DataFormatter();
		String excelPath = System.getProperty("user.dir") + "\\ExcelFiles\\Book2.xlsx";

		try {
			fis = new FileInputStream(excelPath);
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}
		int r = 0;
		int c = 0;
		XSSFSheet sh = wb.getSheet("logins");
		Iterator<Row> rowIt = sh.rowIterator();

		while (rowIt.hasNext()) {
			rowIt.next();
			r++;
		}

		Row FirstRow = sh.getRow(0);
		Iterator<Cell> cellIt = FirstRow.iterator();
		while (cellIt.hasNext()) {
			cellIt.next();
			c++;
		}
		System.out.println("Row =" + r + " Column =" + c);
		Object[][] data = new Object[r - 1][c];
		// Object [][]data = new Object[r-2][c];
		for (int i = 1; i < r; i++) {
			// for(int i = 2 ;i<r;i++) { skips 2 second row also
			for (int j = 0; j < c; j++) {

				String cell = formatter.formatCellValue(sh.getRow(i).getCell(j)).trim();

				data[i - 1][j] = cell;
                //data[i-2][j] = cell;

				System.out.println(data[i - 1][j] + " ");
			}
			System.out.println();
		}

		return data;

	}
	
	public  static void writedata(String fn,String ln,String email,String company,String pwd,
			          String cnfPwd) {
		
		FileInputStream fis;
		XSSFWorkbook wb = null;

		
		String excelPath = System.getProperty("user.dir") + "\\ExcelFiles\\Book2.xlsx";

		try {
			fis = new FileInputStream(excelPath);
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {

			e.printStackTrace();
		}
		
		int i = 0;
	    XSSFSheet sh = wb.getSheet("Register");
	    
	    Iterator<Row> rowIt = sh.iterator();
	    
	    Row firstRow = sh.getRow(i);
	    
	    Iterator<Cell> cellIt = firstRow.cellIterator();
	    
	    while(rowIt.hasNext()) {
	    	rowIt.next();
	    	
	    	if(sh.getRow(i).getCell(1)== null) {
	    		
	    		sh.getRow(i).createCell(1).setCellValue(fn);
	    		sh.getRow(i).createCell(2).setCellValue(ln);
	    		sh.getRow(i).createCell(3).setCellValue(email);
	    		sh.getRow(i).createCell(4).setCellValue(company);
	    		sh.getRow(i).createCell(5).setCellValue(pwd);
	    		sh.getRow(i).createCell(6).setCellValue(cnfPwd);
	    		
	    		FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(excelPath);
					wb.write(fos);
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
				System.out.println("Data andar write ho gaya");
				break;
	    		
	    	}
	    	i++;
	    	
	    	
	    }
	    
	
	    
	}

	public static void result() {
		
		
		
		
	}
}

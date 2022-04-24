package com.excelautomation;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelReader {

	public static void main(String[] args) throws Exception {

		
		File fs = new File("./TestData/Data.xlsx");
		FileInputStream fins = new FileInputStream(fs);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fins);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		
		String value1 =sheet.getRow(1).getCell(0).getStringCellValue();
		String value2 =sheet.getRow(1).getCell(1).getStringCellValue();
		String value3 =sheet.getRow(1).getCell(2).getStringCellValue();
		
		String value01 =sheet.getRow(2).getCell(0).getStringCellValue();
		String value02 =sheet.getRow(2).getCell(1).getStringCellValue();
		String value03 =sheet.getRow(2).getCell(2).getStringCellValue();
		
		double eid = sheet.getRow(1).getCell(3).getNumericCellValue();
		System.out.println((int)eid);
		
		System.out.println(value1+"   "+value2+"  "+value3);
		
		System.out.println(value01+"   "+value02+"  "+value03);
		
		int total_rows = sheet.getLastRowNum();
		int total_cell = sheet.getRow(0).getLastCellNum();
		
		System.out.println(sheet.getFirstRowNum());
		System.out.println(sheet.getRow(0).getFirstCellNum());
		
		System.out.println("row count :"+ total_rows + " column count + "+ total_cell);
		
		XSSFRow row0= sheet.getRow(2);
		
		for(int i=0; i< total_cell;i++) {
			
			System.out.print(row0.getCell(i).toString()+"   ");
		}
		
		System.out.println();
		
		
		
		workbook.close();
	}

}

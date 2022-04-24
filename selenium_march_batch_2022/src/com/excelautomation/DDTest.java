package com.excelautomation;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTest {

	@Test(dataProvider = "getData")
	public void setData(String username, String password, String eid) {

		System.out.println("username is : " + username );
		System.out.println( " password is : " + password);
		System.out.println( " Emp id is : " + eid);
	}

	@DataProvider
	public String[][] getData() {
		String[][] data = null;

		try {

			File fs = new File("./TestData/Data.xlsx");
			FileInputStream fins = new FileInputStream(fs);
			XSSFWorkbook wb = new XSSFWorkbook(fins);
			XSSFSheet sheet = wb.getSheet("Sheet4");

			int row_count = sheet.getLastRowNum();
			int col_count = sheet.getRow(0).getLastCellNum();

			System.out.println(row_count + "  " + col_count);

			data = new String[row_count][col_count];
			for (int i = 0; i <= row_count; i++) {
				for (int j = 0; j < col_count; j++) {
					data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}

			return data;
		} catch (Exception e) {

		}

		return data;
	}

}

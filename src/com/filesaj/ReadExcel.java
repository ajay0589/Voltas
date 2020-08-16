package com.filesaj;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception {

		String filePath = "C:\\Users\\ajayj\\eclipse-workspace\\Voltas\\com.resources\\TestData.xlsx"; // .xlsx or .xls

		File file = new File(filePath);

		FileInputStream fis = new FileInputStream(file);

		BufferedInputStream bis = new BufferedInputStream(fis);

		// WorkBook, WorkSheet, Row, Cell

		Workbook workbook = new XSSFWorkbook(bis); // HSSFWorkbook (.xls)

		Sheet sheet = workbook.getSheet("login");

		Row row = sheet.getRow(0);

		Cell cell = row.getCell(0);

		String value = cell.getStringCellValue();
		System.out.println(value);
	}

}

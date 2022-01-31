package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Multiple_Data {

	public static void allDataExcel() throws Throwable {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\Maven_project\\Excel\\Input Data.xlsx");

		FileInputStream fis=new FileInputStream(f);

		Workbook workBook = new XSSFWorkbook(fis);

		Sheet sheetAt = workBook.getSheetAt(0);

		for (int i = 0; i < sheetAt.getPhysicalNumberOfRows(); i++) {

			Row row = sheetAt.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

				Cell cell = row.getCell(j);

				CellType cellType = cell.getCellType();

				if (cellType.equals(CellType.STRING)) {

					String stringCellValue = cell.getStringCellValue();

					System.out.println(stringCellValue);

				}else if (cellType.equals(CellType.NUMERIC)) {

					double numericCellValue = cell.getNumericCellValue();

					System.out.println(numericCellValue);
				}

			}}

workBook.close();

	}
	public static void main(String[] args) throws Throwable {
		allDataExcel();
		
	}
}

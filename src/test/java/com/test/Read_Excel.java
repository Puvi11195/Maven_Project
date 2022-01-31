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

public class Read_Excel {

	private static void singleData() throws Throwable {

		File f = new File("C:\\Users\\hp\\eclipse-workspace\\Maven_project\\Excel\\Input Data.xlsx");

		FileInputStream fis=new FileInputStream(f);

		Workbook workBook = new XSSFWorkbook(fis);

		Sheet sheetAt = workBook.getSheetAt(0);

		Row row = sheetAt.getRow(1);

		Cell cell = row.getCell(1);

		CellType cellType = cell.getCellType();

		if (cellType.equals(CellType.STRING)) {
			String stringCellValue = cell.getStringCellValue();
			System.out.println(stringCellValue);

		}else if (cellType.equals(CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int value = (int) numericCellValue;
			System.out.println(value);

		}
		workBook.close();
	}
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
				workBook.close();

			}}
	}
	public static void getRow() throws Throwable {
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\Maven_project\\src\\test\\java\\com\\test\\Read_Excel.java");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		int physicalNumberOfCells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < physicalNumberOfCells; i++) {
			Cell cell = row.getCell(i);
			CellType cellType = cell.getCellType();
			if (cellType.equals(CellType.STRING)) {
				String stringValue = cell.getStringCellValue();
				System.out.println(stringValue);

			}
			else if (cellType.equals(CellType.NUMERIC)) {
				double numericCellValue = cell.getNumericCellValue();
				int value=(int) numericCellValue;
				System.out.println(value);

			}
		}
		wb.close();
	}




	public static void main(String[] args) throws Throwable {
		singleData();
		allDataExcel();
		getRow();


	}


}

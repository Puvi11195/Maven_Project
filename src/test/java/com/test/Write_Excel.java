package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	
	public static void writeData() throws Throwable {
		// TODO Auto-generated method stub

	
	File f = new File("C:\\Users\\hp\\eclipse-workspace\\Maven_project\\Excel\\Input Data.xlsx");
	
	FileInputStream fis=new FileInputStream(f) ;
	
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet createSheet = wb.createSheet("DataA");
	
	Row createRow = createSheet.createRow(0);
	
	Cell createCell = createRow.createCell(0);
	
	createCell.setCellValue("Username");
	
	
	wb.getSheet("DataG").getRow(0).createCell(1).setCellValue("Password");
	
	wb.getSheet("DataG").createRow(1).createCell(0).setCellValue("Java1");
	
	wb.getSheet("DataG").getRow(1).createCell(1).setCellValue("yeef123");
	
	wb.getSheet("DataG").createRow(2).createCell(0).setCellValue("Mave");
	
	wb.getSheet("DataG").getRow(2).createCell(1).setCellValue("vij675");
	
	FileOutputStream fos = new FileOutputStream(f);
	
	wb.write(fos);
	wb.close();
	
	System.out.println("Data driven successfully");
	}
	
public static void main(String[] args) throws Throwable {
	
	writeData();
}
}
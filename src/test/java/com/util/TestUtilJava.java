package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestUtilJava {
	
	    public Workbook workbook;
	    public Sheet sheet;

	    // Constructor to initialize the workbook and sheet
	    public void Xls_Reader(String filePath, String sheetName) throws IOException {
	        FileInputStream file = new FileInputStream(new File(filePath));
	        workbook = new XSSFWorkbook(file);  // For .xlsx files. Use HSSFWorkbook for .xls files
	        sheet = workbook.getSheet(sheetName);
	    }

	    // Method to get row count
	    public int getRowCount() {
	        return sheet.getPhysicalNumberOfRows();
	    }

	    // Method to get column count
	    public int getColumnCount() {
	        return sheet.getRow(0).getPhysicalNumberOfCells();  // Assuming the first row contains headers
	    }

	    // Method to get data from a specific cell
	    public String getCellData(int rowNum, int colNum) {
	        Row row = sheet.getRow(rowNum);
	        if (row == null) return ""; // Return empty string if row is null
	        Cell cell = row.getCell(colNum);
	        if (cell == null) return ""; // Return empty string if cell is null
	        return cell.toString();  // Return cell data as a string
	    }

	    // Close the workbook to free up resources
	    public void close() throws IOException {
	        workbook.close();
	    }
	}
	
	


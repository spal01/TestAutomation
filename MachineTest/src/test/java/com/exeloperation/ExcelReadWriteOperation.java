package com.exeloperation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;


public class ExcelReadWriteOperation {
	private XSSFWorkbook xssfWorkBook;
	private XSSFSheet xssfSheet;
	private Row row;
	
	private FileInputStream fis;
 
	public ExcelReadWriteOperation() throws IOException{
	 
		fis=new FileInputStream("E://javaWorkspace//MachineTest//testdata//TestData.xlsx");
		xssfWorkBook=new XSSFWorkbook(fis);
		
	}

	public String getData(String sheetName,int rowIndex,int colIndex){
		xssfSheet=xssfWorkBook.getSheet(sheetName);
		row=xssfSheet.getRow(rowIndex);
		
		Cell cell=row.getCell(colIndex);
		String data=cell.getStringCellValue();
		return data;	
	}
	
	public int totalNumberRow(String sheetName){
		xssfSheet=xssfWorkBook.getSheet(sheetName);
		return (xssfSheet.getLastRowNum()+1);
	}
	
	public ArrayList<String> getAllColDataForParticularRow(String sheetName,int rowIndex){
		
		xssfSheet=xssfWorkBook.getSheet(sheetName);
		row=xssfSheet.getRow(rowIndex);
		int col=row.getLastCellNum();
		ArrayList<String> allColumnData=new ArrayList<String>();
		
		for(int i=0;i<=col;i++){
			allColumnData.add(row.getCell(i).getStringCellValue());
		}
			
		return allColumnData;
	}
	
	

	
	
	
	public static void main(String[] args) throws IOException{
		
		ExcelReadWriteOperation ob=new ExcelReadWriteOperation();
		System.out.println(ob.totalNumberRow("Sheet1"));
		System.out.println(ob.getData("Sheet1", 0, 0));
		System.out.println(ob.getData("Sheet1", 0, 0));
		
	}



}

package com.Ahamad.Assignment7;

import java.io.*;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class _4_xls {
	private static final String FILE_NAME = "F:\\Java\\MyFirstExcel.xlsx";

	public static void main(String[] args) throws IOException{
		System.out.println("This is 1st line");
    XSSFWorkbook wbook = new XSSFWorkbook(XSSFWorkbookType .XLSX);
   
    XSSFSheet sheet = wbook.createSheet("First excel");
   ArrayList week = new ArrayList();
   Scanner sc = new Scanner(System.in);
   System.out.println("Please Enter the week names you want to enter into the excel file");
   for(int i=0;i<7;i++){
	   week.add(sc.next());
   }
    int rowNum = 0;
    
    System.out.println("Creatingexcel file");
    for(int i =1;i<week.size();i++){
    	Row row = sheet.createRow(i);
    	Cell cell = row.createCell(0);
    	cell.setCellValue((String) week.get(i-1));
    }
  
    try {
        FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
        wbook.write(outputStream);
        wbook.close();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }

    System.out.println("Done");
    
    
	}
    
    
    
    
}
   /* XSSFSheet sheet = wbook.createSheet("Datatypes in Java");
    Object[][] datatypes = {
            {"Datatype", "Type", "Size(in bytes)"},
            {"int", "Primitive", 2},
            {"float", "Primitive", 4},
            {"double", "Primitive", 8},
            {"char", "Primitive", 1},
            {"String", "Non-Primitive", "No fixed size"}
    };
    int rowNum = 0;
   

   for (Object[] datatype : datatypes) {
        Row row = sheet.createRow(rowNum++);
        int colNum = 0;
        for (Object field : datatype) {
            Cell cell = row.createCell(colNum++);
            if (field instanceof String) {
                cell.setCellValue((String) field);
            } else if (field instanceof Integer) {
                cell.setCellValue((Integer) field);
            }
        }
    }  */
    



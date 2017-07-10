package com.Ahamad.Assignment7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.poi.xssf.usermodel.*;
import java.util.*;

public class _5_StudentInfo {
	/*
	 * You can enter the address of the file in your desired destination
	 */
	private static final String FILE_NAME = "F:\\Java\\StudentInfo.xlsx";

	public static void main(String[] args) {
		
		System.out.println("How many students do you want to input");
		Scanner sc = new Scanner(System.in);
		int numStud = sc.nextInt();
		System.out.println("Please enter the student details in the given order and respective types for each student ");
		Student[] obj1 = new Student[numStud];
		try{
		for(int i=0;i<numStud;i++){
			System.out.println("Please enter student id in (String) format");
			String id = sc.next();
			System.out.println("Please enter student name in(String) format");
			String name = sc.next();
			System.out.println("Please enter the marks in int format");
			int marks =(int) sc.nextInt();
			System.out.println("Please enter the fees in double format");
			double fees =(double) sc.nextDouble();
			obj1[i] = new Student(id,name,marks,fees);
		}}catch(InputMismatchException e){
			System.out.println("Please input according to the given format");
		}
		 XSSFWorkbook wbook = new XSSFWorkbook(XSSFWorkbookType .XLSX);
		   
		    XSSFSheet sheet = wbook.createSheet("Excel with StudentInfo");
		    try{
		    for(int i=0;i<numStud;i++){
		    	
		    	XSSFRow row = sheet.createRow(i);
		    	for(int j=0; j<4;j++){
		    	XSSFCell cell = row.createCell(j);
		    	if(j==0)
		    		cell.setCellValue(obj1[i].id);
		    	else if(j==1)
		    		cell.setCellValue(obj1[i].name);
		    	else if(j==2)
		    		cell.setCellValue(obj1[i].marks);
		    	else if(j==3)
		    		cell.setCellValue(obj1[i].fees);
		    	
		    	}
		    }
		    }catch(NullPointerException e){
		    	System.out.println("Please restart the program as we do not have all the details");
		    }
		    
		    try {
		        FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
		        wbook.write(outputStream);
		        wbook.close();
		        System.out.println("Your data has been written to excel file. Thank you");
		    } catch (FileNotFoundException e) {
		        e.printStackTrace();
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		    
		    
		    

	}

}


package com.Ahamad.Assignment7;

import java.io.*;

public class _1_FileBr {
	/*
	 * Please enter the path  where you want to create a file in to the 
	 * String fileName
	 */
	
	private static final String fileName = "F:\\Java\\fread_1st_file.txt ";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String text = "Hello World";
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			bw.write(text);
			bw.newLine();
			for(int i=1;i<=10;i++){
				for(int j=1;j<=10;j++){
					if(j==10)
						bw.write(i*j+"");
					else
						bw.write(i*j+"\t");
				}
				//bw.write("\n");
				bw.newLine();
			}
			System.out.println("Your text is written to the file");
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}

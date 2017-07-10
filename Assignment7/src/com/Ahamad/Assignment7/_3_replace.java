package com.Ahamad.Assignment7;

import java.io.*;
import java.util.Scanner;

public class _3_replace {

	public static void main(String[] args) throws IOException {
		final String fileName = "F:\\Java\\replace.txt";
		int lineCount = 0;
	    int wordCount = 0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Please enter the word you want to replace");
	    String search = sc.next();
	    System.out.println("Please enter the word with which you want the above word replaced ");
	    String repl = sc.next(); 
	    String line = "";
	    
	    try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			
			//String line = null;
			String currentLine =reader.readLine();
			while(currentLine!=null){
				String asp = currentLine.replaceAll(search, repl);
				//System.out.println(asp);
				 line=line+asp+"\n";
				System.out.println(line);
			    currentLine = reader.readLine();
			}
			System.out.println("The process is complete");
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
	    bw.write(line);
	    bw.close();

	}

}

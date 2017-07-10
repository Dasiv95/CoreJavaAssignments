package com.Ahamad.Assignment7;

import java.io.*;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class _2_NoWords {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
	    //System.out.println("Please enter the address of the file acceptable by Java");
	    //String fileName = sc.next();
		final String fileName = "F:\\Java\\fread_1st_file.txt";
	    int lineCount = 0;
	    int wordCount = 0; 
	    int count = 0;
	    try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
	    	String currentLine = reader.readLine();
	    	while(currentLine!=null){
	    		lineCount++;
	    		//System.out.println(currentLine.length());
	    		for(int i=0;i<currentLine.length();i++){
	    			if(Character.isWhitespace(currentLine.charAt(i))){
	    				if(currentLine.charAt(i)==currentLine.charAt(i-1)){
	    					//This loop is to check the occurence of 2 simultaneous whitespaces.
	    					count+=1;
	    				}
	    				continue;
	    			}
	    			else
	    				count+=1;
	    		}
	    		/*String[] words = currentLine.split(" ");
	    		for(int i=0;i<words.length;i++)
	    			System.out.println(words[i]); */
	    		
	    		wordCount = wordCount + currentLine.length()-count+1;
	    		currentLine = reader.readLine();

	    		count =0; // this is to initialize it for every new line
	    	}
	    }
		//BufferedReader reader = new BufferedReader(new FileReader(fileName))
 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
		System.out.println("The total number of lines in the  given file is :"+lineCount);
		System.out.println("The total nummber of words in the given file is :"+wordCount);
		
	}

}

import java.util.*;

/*
 * 6) Write a program to find a number of vowels and consonents in a String?
 */

public class _6_VowelConsonants {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String line = sc.nextLine();
		char []text = new char[line.length()];
		for(int i=0;i<line.length();i++){
			text[i] = line.charAt(i);
		}
		
		String vow = "aeiou";
		String []vowel = vow.split("");
		int vowCount =0;
		int check = 0;
		int conCount = 0;
	
		for(int i=0;i<line.length();i++){
			if(Character.isAlphabetic(text[i])){
				
				for(int j=0;j<vowel.length;j++){
					if(vowel[j].equalsIgnoreCase(""+text[i])){
						// implies it is a vowel
						
						vowCount+=1;
						break;
					}
					check+=1;
					}
				
				if(check==5){
					conCount+=1;
				}
				}
			check = 0; // This is for every alphabet so that our if condition doesn't fail
			}
		System.out.println("Number of vowels in the given string is :"+vowCount);
		System.out.println("Number of consonants in the given string is :"+conCount);

	}

}

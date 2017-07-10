/*
 * 5)Check if a particular key exists in Java HashMap example
 */

import java.util.*;

public class _5_HashKey {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Ali");
		map.put(2, "Sayed");
		map.put(3, "Ahamad");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the key you want to search. In this example all the keys are in integer format");
		try{
		int search = sc.nextInt();
		if(map.containsKey(search))
			System.out.println("The key "+search+" exists in the map");
		else
			System.out.println("The key "+search+" doesnot exist in the map");
		}catch(Exception e){System.out.println("Please enter the key in the required format");}
		

	}

}

import java.util.HashMap;
import java.util.Scanner;

/*
 * 6)Check if a particular value exists in Java HashMap example
 */


public class _6_HashValue {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Ali");
		map.put(2, "Sayed");
		map.put(3, "Ahamad");
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value you want to search. In this example all the values are in String format");
		try{
		String search = sc.next();
		if(map.containsValue(search))
			System.out.println("The value "+search+" exists in the map");
		else
			System.out.println("The value "+search+" doesnot exist in the map");
		}catch(Exception e){System.out.println("Please enter the value in the required format");}
		


	}

}

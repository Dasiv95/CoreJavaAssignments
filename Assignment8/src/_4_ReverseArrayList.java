
import java.util.*;

public class _4_ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("How many elements do you want to enter in to this arraylist");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Please enter the elements");
		ArrayList al = new ArrayList();
		for(int i=0;i<num;i++){
			al.add(sc.next());
		}
		Collections.reverse(al);
		System.out.println("The reverse order of all elements is as shown below ");
		for(int i=0;i<num;i++){
			System.out.println(al.get(i));
		}

	}

}

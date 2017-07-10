import java.util.*;

public class _2_minArList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("How many elements do you want to add to the list");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Please enter the elements one by one");
		for(int i=0;i<num;i++){
			System.out.println("Please enter the next element");
			al.add(sc.nextInt());
			
		}
		System.out.println("Now let us find the minimum element of this list you entered");
        Collections.sort(al, null);
        System.out.println("The minimum element is : "+al.get(0));
	}

}

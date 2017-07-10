
import java.util.*;

public class _3_minHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet al = new HashSet();
		System.out.println("How many elements do you want to add to the list");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Please enter the elements one by one");
		for(int i=0;i<num;i++){
			System.out.println("Please enter the next element");
			al.add(sc.nextInt());
			
		}
		System.out.println("Now let us find the minimum element of this list you entered");
        
		Iterator itr = al.iterator();
		int min = (int) itr.next();
		
		while(itr.hasNext()){
			if(min>(int)itr.next()){
				min =(int) itr.next();
			}
		}
        System.out.println("The minimum element is : "+min);

	}

}

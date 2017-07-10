import java.util.*;

public class _3_DuplicateInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String test = sc.nextLine();
		
		String[] arr = test.split("");
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		int value=0;
		for(int i=0;i<arr.length;i++){
			if(!map.containsKey(arr[i])){
				map.put(arr[i], 1);
			}
			else{
				value = map.get(arr[i]);
				map.put(arr[i], value+1);
			}
		}
		int val = 0;
		for(Map.Entry m: map.entrySet()){
			val = (int) m.getValue();
			if(val>1){
				System.out.println(m.getKey()+"\t"+m.getValue());
			}
		}

	}

}

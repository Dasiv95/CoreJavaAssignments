
import java.util.*;

public class _2_MostAppearedElement {

	public static void main(String[] args) {
		int a[] = {6,4,5,7,3,6,4,7,6,2,9,6};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		/*
		 * I am using an integer array. Therefore have to use Map<Integer,Integer>
		 * If we take String array then we have to take Map<String,Integer>
		 */
		int value =0;
		for(int i=0;i<a.length;i++){
			/*
			 * If it is the first occurence of the element then its value is assigned
			 * 1 otherwise it is incremented
			 */
			if(!map.containsKey(a[i])){
				map.put(a[i], 1);
			}
			else{
				value = map.get(a[i]);
				map.put(a[i], value+1);
			}
		}
		int mapLen=0; // total number key value pairs in map. 
		for(Map.Entry m:map.entrySet()){
			++mapLen;
		}
		int []k = new int[mapLen]; 
		int []v = new int[mapLen];
		int j=0;
		 for(Map.Entry m:map.entrySet()){ 
			   k[j] = (int) m.getKey();  //keys are in this array
			   v[j] =(int) m.getValue(); //values are in the array
			   ++j;
			  }
		 int max = v[0];
		 int index=0;
		 /*
		  * From the below for loop I am finding maximum value and its index
		  * And will use that index to get the key.
		  */
		 for(int i=0;i<v.length;i++){
			 if(max<v[i]){
				 max=v[i];  
				 index=i;
			 }
		 }
		 System.out.println("The value that is repeated more times is '"+k[index]+"' and it is repeated '"+max+"' times");
		
	}

}

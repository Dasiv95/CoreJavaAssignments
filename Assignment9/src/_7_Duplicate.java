import java.util.HashMap;
import java.util.Map;

/*
 * Find duplicates in an array if there is more than one duplicate?
 */


public class _7_Duplicate {

	public static void main(String[] args) {
		/*
		 * First let us try for an integer array
		 */
		/*
		 * From my understanding of the question if there is more than one duplicate of
		 * any element then we have to output them
		 */
		int []a = {1,2,3,4,2,4,3,5,6,2,3};
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
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
		 int []help = new int[mapLen];
		 int hind = 0;
		 for(int i=0;i<v.length;i++){
			 if(v[i]>2){
				 System.out.println("The number "+k[i]+" appeared more than twice");
			     help[hind]=k[i];
			     ++hind;
			 }
		 }
		 int []helper = new int[hind];
		 for(int i=0;i<hind;i++){
			 helper[i] = help[i];
		 }
		 for(int i=0;i<helper.length;i++){
			 System.out.println("The value "+helper[i]+" is repeated at the following indices");
			 for(int l=0;l<a.length;l++){
				 if(helper[i]==a[l])
					 System.out.print(l+"\t");
			 }
			 System.out.println();
			 
		 }

	}

}

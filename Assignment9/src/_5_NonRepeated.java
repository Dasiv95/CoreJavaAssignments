/*
 * 5) Print first non-repeated character in String?
 */


import java.util.*;

public class _5_NonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a string");
		String a = sc.next();
        String[] test = a.split("");
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		int value=0;
		for(int i=0;i<test.length;i++){
			if(!map.containsKey(test[i])){
				map.put(test[i], 1);
			}
			else{
				value = map.get(test[i]);
				map.put(test[i], value+1);
			}
		}
		int val = 0;
		int mapLen=0; // total number key value pairs in map. 
		for(Map.Entry m:map.entrySet()){
			++mapLen;
		}
		String []help = new String[mapLen];
		int hind=0;
		for(Map.Entry m: map.entrySet()){
			val = (int) m.getValue();
			if(val==1){
				help[hind] = (String) m.getKey();
				++hind;
			}
		}
		String []helper = new String[hind];
		for(int i=0;i<hind;i++){
			helper[i]=help[i];
		}
		int minIndex = 0;
		for(int l=0;l<test.length;l++){
			if(test[l].equals(helper[0]))
				minIndex = l;
		}
		for(int i=0;i<helper.length;i++){
			for(int l=0;l<test.length;l++){
				if(test[l].equals(helper[i]+"")){
					if(minIndex>l)
						minIndex=l;
				}
			}
		}
System.out.println("The first non repeating character is "+a.charAt(minIndex));

	}

}

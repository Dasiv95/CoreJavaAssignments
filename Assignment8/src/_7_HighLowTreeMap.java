
import java.util.*;

public class _7_HighLowTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1, "ali");
		map.put(5, "sayed");
		map.put(4, "ram");
		map.put(3, "krish");
		System.out.println("The lowest key in the given map is : "+map.firstKey());
		System.out.println("The highest key in the given map is : "+map.lastKey());

	}

}

package collectionframework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class m1 {

	public static void main(String[] args) {
		
		/*map
		 * 
		 * container: elements will be stored along with its key
		 * 
		 * key: any datatype
		 * element: any datatype
		 * 
		 * add
		 * remove
		 * retrieve
		 * 
		 * treemap: keys: alphabetical/ascending order
		 * linkedhashmap:  insertion order
		 * hashmap:     : unpredictable order
		 * 
		 * TreeMap<dtypeofkey, dtypeofelement> name= new TreeMap<>();
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * key: integer
		 * element: String
		 * 
		 * */
		
		TreeMap<Integer,String>t= new TreeMap<>();
		t.put(30, "orange");
		t.put(80, "apple");
		t.put(8, "banana");
		t.put(0, "kiwi");
		System.out.println(t);
		
		LinkedHashMap<Integer,String>t1= new LinkedHashMap<>();
		t1.put(30, "orange");
		t1.put(80, "apple");
		t1.put(8, "banana");
		t1.put(0, "kiwi");
		System.out.println(t1);
		
		
		HashMap<Integer,String>t11= new HashMap<>();
		t11.put(30, "orange");
		t11.put(80, "apple");
		t11.put(8, "banana");
		t11.put(0, "kiwi");
		System.out.println(t11);
	}
}

package collectionframework;

import java.util.TreeMap;

public class m2 {

	public static void main(String[] args) {
		
		TreeMap<Integer,String>t= new TreeMap<>();
		t.put(30, "orange");
		t.put(80, "apple");
		t.put(8, "banana");
		t.put(0, "kiwi");
		System.out.println(t);
		
		//remove: know the key
		t.remove(80);
		System.out.println(t);
		
		// retrival: know the key
		System.out.println(t.get(0));
		
		// keys
		System.out.println(t.keySet());
		
		//values
		System.out.println(t.values());
		
		//pair
		System.out.println(t.entrySet());
	}
}

package collectionframework;

import java.util.Hashtable;

public class ht {

	public static void main(String[] args) {
		Hashtable<Integer,String>t= new Hashtable<>();
		t.put(30, "orange");
		t.put(80, "apple");
		t.put(8, "banana");
		t.put(0, "kiwi");
		System.out.println(t);
		
		t.remove(0);
		System.out.println(t);
		
		System.out.println(t.get(0));
		
		System.out.println(t.keySet());
		System.out.println(t.values());
		System.out.println(t.entrySet());
	}
}

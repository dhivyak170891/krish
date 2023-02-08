package collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class s1 {
	public static void main(String[] args) {
		
		/*set
		 * 
		 * not indexed
		 * add
		 * remove
		 * retrival is not possible
		 * iterate
		 * only unique values
		 * 
		 * 
		 * treeset           : alphabetical/ascending
		 * hashset           : random order
		 * linkedhashset     : insertion order 
		 * 
		 * 
		 * 
		 * */
		
		TreeSet<Integer>t= new TreeSet<>();
		t.add(90);
		t.add(0);
		t.add(80);
		t.add(100);
		t.add(9000);
		System.out.println(t);
		
		LinkedHashSet<Integer>t1= new LinkedHashSet<>();
		t1.add(90);
		t1.add(0);
		t1.add(80);
		t1.add(100);
		t1.add(9000);
		System.out.println(t1);
		
		HashSet<Integer>t11= new HashSet<>();
		t11.add(90);
		t11.add(0);
		t11.add(80);
		t11.add(100);
		t11.add(9000);
		System.out.println(t11);
	}

}

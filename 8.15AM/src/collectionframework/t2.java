package collectionframework;

import java.util.TreeSet;

public class t2 {
public static void main(String[] args) {
	
	
	TreeSet<Integer>t= new TreeSet<>();
	t.add(90);
	t.add(0);
	t.add(80);
	t.add(100);
	t.add(9000);
	System.out.println(t);
	
	t.remove(9000);
	System.out.println(t);
	
	for(int x:t)
	{
		System.out.println(x);
	}
}
}

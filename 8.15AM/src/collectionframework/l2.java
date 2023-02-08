package collectionframework;

import java.util.ArrayList;

public class l2 {
	
	public static void main(String[] args) {
		
		ArrayList<String>l= new ArrayList<>();
		l.add("hi");
		l.add("bye");
		l.add("hello");
		l.add("welcome");
		l.add("seeyou");
		System.out.println(l);
		
		// index    0    1   2       3          4    
		// value    hi  bye  hello  welcome   seeyou
		
		//remove: know the index 
		
		l.remove(3);
		System.out.println(l);
		
		//retrival: know the index
		System.out.println(l.get(1));
		
		//iteration
		// for each loop/ enhanced for loop
		// syntax: for(datatype tempvariable: nameofthecollection)
		
		for(String x:l)
		{
			System.out.println(x);
		}
	}

}

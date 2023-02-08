package collectionframework;

import java.util.ArrayList;

public class l1 {
	
	public static void main(String[] args) {
		
		/*
		 * 
		 * list
		 * 
		 * index based
		 * add
		 * remove
		 * iterate
		 * retrieve
		 * accept duplicates
		 * 
		 * syntax:  ArrayList<datatype> name= new ArrayList<>();
		 * 
		 * int=> Integer
		 * string=> String
		 * char=> Character
		 * boolean=> Boolean * 
		 * */
		
		ArrayList<Integer>l= new ArrayList<>();
		l.add(90);
		l.add(0);
		l.add(10);
		l.add(900);
		l.add(70);
		System.out.println(l);
		
		// index    0    1   2    3     4    
		// value    90   0   10   900   70
		
		//remove: know the index 
		
		l.remove(3);
		System.out.println(l);
		
		//retrival: know the index
		System.out.println(l.get(1));
		
		//iteration
		// for each loop/ enhanced for loop
		// syntax: for(datatype tempvariable: nameofthecollection)
		
		for(int x:l)
		{
			System.out.println(x);
		}
	}

}

package builtinclass;

public class s1 {
	
	public static void main(String[] args) {
		
		//String:  class, datatype
		//n=> object, variable 
		String n="WelcomeAll";
		
		//   0   1   2   3    4   5   6    7   8   9
		//   W   e   l   c    o   m   e    A   l    l
		
		System.out.println(n.length());
		System.out.println(n.indexOf('m'));
		System.out.println(n.charAt(1));
		
		System.out.println(n.toLowerCase());
		System.out.println(n.toUpperCase());
		
		System.out.println(n+"hi");
		System.out.println(n.concat("hi"));
		
		System.out.println(n.replace('c', 'd'));
		System.out.println(n.replace("come", "go"));
		
		System.out.println(n.contains("hi"));
		
		System.out.println(n.substring(5, 7));  // end index - exclusive    5,6
		
	}

}

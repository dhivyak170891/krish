package builtinclass;

public class s2 {
	
	public static void main(String[] args) {
		
		//String buffer
		
		StringBuffer n=new StringBuffer("WelcomeAll");
		
		//   0   1   2   3    4   5   6    7   8   9     
		//   W   e   l   c    o   m   e    A   l    l
		
		System.out.println(n.length());
		System.out.println(n.indexOf("m"));
		System.out.println(n.charAt(1));
		
		// insert, append
		System.out.println(n.append("hello"));
		System.out.println(n.insert(3, "go"));
		
		// delete
		System.out.println(n.delete(12, 17));  //12,13,14,15,16
		System.out.println(n.deleteCharAt(3));
		
		System.out.println(n.replace(0, 4,"WEL"));
		
		System.out.println(n.reverse());
		System.out.println(n.reverse());
		
	}

}

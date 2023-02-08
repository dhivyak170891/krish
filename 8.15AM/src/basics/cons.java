package basics;

public class cons {

	public static void main(String[] args) {
		
		
		/*
		 * constructor: 
		 * 
		 *         sepcial method
		 *         take classname as its name
		 *         doesnot contain return type
		 *         will be automatically called whenever an obj is created
		 *         created outside the main method
		 *         called inside the main method
		 *         
		 *         syntax for creation:  accessmodifier classname(){}
		 *         syntax for calling:   classname objectname= new classname();
		 * * 
		 *     average of three numbers 
		 * */
		
		cons ob= new cons();
	}
	
	public cons()
	{
		int d=9;
		int e=3;
		System.out.println("Addition of two numbers "+ (d+e));
	}
}

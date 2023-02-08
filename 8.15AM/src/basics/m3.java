package basics;

public class m3 {
	
	public static void main(String[] args) {
		
		//classname objectname= new classname();
		// objectname.methodname();
		
		m3 ob= new m3();
		ob.average();
		ob.add();
		
		// area of rectangle using nonstatic:  public
		// division of two numbers          : private
		
	}
	
	
	public void average()
	{
		double a=9.8;
		double b=2.3;
		System.out.println("Average of two numbers "+ (a+b)/2);
	}
	
	private void add()
	{
		int a=90;
		int b=30;
		System.out.println("Addition of two numbers "+ (a+b));
	}

}

/*
 *
 * nonstatic:  doesnot contain fixed memory space
 * we need to allocate memory space for calling it
 * 
 * syntax for creation:  accessmodifier returntype name(){}
 * 
 * syntax for calling:
 * 
 *  step1:  creating and naming object:    classname objectname= new classname();
 *  step2:                                 objectname.methodname();
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

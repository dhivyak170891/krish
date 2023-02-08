package basics;

public class m1 {
	
	public static void main(String[] args) {
		
		//classname.methodname();
		m1.area();
		m1.average();
		
		// private:  product of two numbers
		
		
	}
	
	//accessmodifier static returntype name(){}
	public static void area()
	{
		int s=3;
		System.out.println("Area of square is "+ s*s);
	}
	
	
	private static void average()
	{
		double a=4.5;
		double b=3.2;
		System.out.println("Average of two numbers : "+ (a+b)/2);
	}
	
	

}

/*method: block of code which performs certain action
 * 
 * static 
 * nonstatic 
 * 
 * method should be created outside the main method, inside the class
 * method should be called inside the main method
 * 
 * syntax for creation:  accessmodifier static returntype name(){}
 * syntax for calling :  classname.methodname()
 * 
 * accessmodifier:  public, private, protected 
 * returntype:  void, int, float, double, string, boolean, char
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
 * 
 * 
 * 
 * */


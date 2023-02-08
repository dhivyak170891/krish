package basics;

public class m2 {

	public static void main(String[] args) {
		
		
		// returntype other than void-  int, double, float, string, boolean, char
		//creation: add return statement at the end
		//calling :  call the method within sysout statement 
		
		System.out.println(m2.product());
		System.out.println(m2.area());
		
		}
	public static int product()
	{
		int a=4;
		int b=7;
		int c=a*b;
		return c;
	}
	
	
	private static double area()
	{
		double r=3.4;
		double A=3.14*r*r;
		return A;
	}
}

package overloading;

public class c3 {

	public static void main(String[] args) {
		
		
		c3 ob= new c3();
		c3 ob1= new c3(4);
		c3 ob2= new c3(3.2);
		c3 ob3= new c3(3,4.5);
		c3 ob4= new c3(10.4,7);
		
	}
	
	public c3()
	{
		System.out.println("area");
	}
	
	public c3(int s)
	{
		System.out.println("area f square is "+ s*s);
	}
	
	public c3(double r)
	{
		System.out.println("area of circle is "+ 3.14*r*r);
	}
	
	public c3(int l, double b)
	{
		System.out.println("Area of rectangle "+ l*b);
	}
	
	public c3(double b, int l)
	{
		System.out.println("Area of triangle is "+ 0.5*l*b);
	}
	
	
}

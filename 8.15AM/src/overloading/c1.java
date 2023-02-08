package overloading;

public class c1 {
	
	public static void main(String[] args) {
		
		/*
		 *inheritance    :  single, multiple, multilevel. hierrarchial
		 *polymorphism   : overloading and overriding  
		 *encapsulation
		 *abstraction 
		 * 
		 * overloading: using same methodname for different purpose 
		 *              showing difference in number /datatype/order
		 *              static, nonstatic, constructor
		 * 
		 * */
		
		c1.area();
		c1.area(3);
		c1.area(3.2);
		c1.area(30, 4.5);
		c1.area(3.2, 5);
	}
	
	public static void area()//0
	{
		System.out.println("area method");
	}
	
	
	public static void area(int s)//1
	{
		System.out.println("area of square is "+ s*s);
	}
	
	public static void area(double r)//1//datatype
	{
		System.out.println("area of circle is "+ 3.14*r*r);
	}
	
	
	public static void area(int l, double b)
	{
		System.out.println("area of rectangle "+ l*b);
	}
	
	public static void area(double b, int l)
	{
		System.out.println("area of triangle is "+ 0.5*l*b);
	}

}

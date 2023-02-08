package overloading;

public class c2 {
public static void main(String[] args) {
	
	c2 ob= new c2();
	ob.area();
	ob.area(3);
	ob.area(3.2);
	ob.area(30, 4.5);
	ob.area(2.5, 10);
}

public  void area()//0
{
	System.out.println("area method");
}


public  void area(int s)//1
{
	System.out.println("area of square is "+ s*s);
}

public  void area(double r)//1//datatype
{
	System.out.println("area of circle is "+ 3.14*r*r);
}


public  void area(int l, double b)
{
	System.out.println("area of rectangle "+ l*b);
}

public  void area(double b, int l)
{
	System.out.println("area of triangle is "+ 0.5*l*b);
}
}

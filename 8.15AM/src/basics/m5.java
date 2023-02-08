package basics;

public class m5 {

	public static void main(String[] args) {
		//parameters: variable passed to the function definition
		// arguments: value assigned to the parameter while calling it 
		// number of parameters= number of arguments
		
		m5.area(4);//4=> argument
		m5 ob= new m5();
		ob.div(3.4, 5.6);
		
	}
	public static void area(int side)//side=> parameter
	{
		System.out.println("Area of square is "+ side*side);
	}
	
	
	public void div(double a, double b)
	{
		System.out.println("Division of two numbers "+ a/b);
	}
}

package exceptionhandling;

public class trywithmultiple {
public static void main(String[] args) {
	try {
		//System.out.println(4/0);
		String s="hi";
		System.out.println(s.charAt(5));
		
		}
	catch(ArithmeticException e)
	{
		System.out.println("Arithmetic exception");
	}
	catch(ClassCastException e)
	{
		System.out.println("class cast exception");
	}
		
     catch(ArrayStoreException e)
		{
			System.out.println("ArrayStoreException");
		}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
}

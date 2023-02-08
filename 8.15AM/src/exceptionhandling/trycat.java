package exceptionhandling;

public class trycat {
	public static void main(String[] args) {
		
		/*
		 * try: code which is having probability of getting error
		 * catch: handles the exception, willbe executed only when error occurs
		 ** 
		 * */
		try {
		System.out.println(9/0);
		}
		catch(Exception e)
		{
			System.out.println("error is "+ e);
		}
		
	}

}

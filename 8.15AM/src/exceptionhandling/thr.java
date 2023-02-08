package exceptionhandling;

import java.util.Scanner;

public class thr {
	
	public static void main(String[] args) {
		
		//throw => throw an exception when particular condition is met
		//syntax:  throw new exceptionclassname("error message")
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your age : ");
		
		int age=s.nextInt();
		
		if(age>18)
		{
			System.out.println("eligible to vote");
		}
		
		else
		{
			throw new ArithmeticException("you are minor .. cannot vote");
		}
	}

}

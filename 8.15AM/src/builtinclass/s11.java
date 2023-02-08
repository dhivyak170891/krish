package builtinclass;

import java.util.Scanner;

public class s11 {
	
	public static void main(String[] args) {
		
		
		//Scanner:   builtin class, get input from the user at runtime
		// nonstatic
		// int=> next int
		// string=> next line
		// boolean=> nextboolean
		//
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = s.nextLine();
		System.out.println("Enter your age :");
		int age=s.nextInt();
		System.out.println("Enter your salary : ");
		double sal = s.nextDouble();
		
		System.out.println("Name is "+ name);
		System.out.println("Age is "+ age);
		System.out.println("Salary is "+ sal);
	}

}

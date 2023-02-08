package basics;

public class var {
	
	public static void main(String[] args) {
		
		// variable:  name given to a memory location
		// syntax for variable declaration:   datatype variablename=value;
		
		/*
		 * word:      String
		 * 
		 * alphabet:  char
		 * 
		 * number :   int, double, float, long, short
		 *  
		 *            double: store upto 16 digits after decimal point 
		 *            float:  store upto 8 digits after decimal point, add f at the end
		 *            
		 * true/false:  boolean
		 * * 
		 * */
		
		// datatype variablename=value;
		
		String n="dhivya";
		char lettr='k';
		int age=30;
		double height=1.70;
		float weight=62.3f;
		boolean result=false;
		
		System.out.println("Name is "+n);
		System.out.println("Letter is "+ lettr);
		System.out.println("Age is "+ age);
		System.out.println("Height is "+ height);
		System.out.println("Weight is "+ weight);
		System.out.println("Result is "+ result);
		
		
		// average of three numbers
		// area of rectangle                : l*b
		
		// area of triangle                 : 0.5*b*h
		// area of square                   : side*side
		// product of three nummbers
		
		int a=90;
		int b=20;
		int c=9;
		
		System.out.println("Average of three numbers "+ (a+b+c)/3);
		
		double m=0.9;
		double n1=7.8;
		System.out.println("area of rectangle s "+ m*n1);
		m1.area();
		//m1.average();
	}

}

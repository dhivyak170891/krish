package basics;

public class Intro {
	
	public static void main(String[] args) {
		
		System.out.println("welcome");
		System.out.println('e');
		System.out.println(9);
		System.out.println(0.9);
		m1.area();//public
		//m1.average();=> private
		System.out.println(m2.product());
		//System.out.println(m2.area());
		m3 ob= new m3();
		ob.average();
		//ob.add();
	}

}



/*jdk , eclipse
 * 
 * jdk: java development kit:   envr to work with java code
 * eclipse:  editor tool:    code easily
 * 
 * eclipse
 * 
 * file=> new => project=> java project=> name=> finish
 * 
 * src:   source folder 
 * jre:    java run time env:   builtin classes, methods
 * 
 * 
 * package:  folder structure that will help u to store similar code
 *           code retrival is easy
 *           
 *right clicked on project=> new = > package=> name=> finish
 *
 *class: template
 *right clicked on package=> new => class=> name=> finish
 *
 *
 * syntax for class :   public class classname{}
 * accessmodifiers
 * public               :   can be used anywhere inside the project 
 * private              :   can be used only within the class 
 * protected            : can be used within the class and its related class
 * 
 * class must be public in nature 
 * 
 * run the class: compiler looks for main method
 * 
 * main methd
 * 
 *  code runnable
 *  cong=> application
 *  
 *  builtin method
 *  
 * 
 * word=> enclose that with double quotes
 * alphabet=> enclose that with single quote
 * number=> no need for quotes 
 * 
 * 
 * */
 
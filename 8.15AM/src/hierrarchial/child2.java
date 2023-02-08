package hierrarchial;

import inheritance.child;

public class child2 extends parent{

	public static void main(String[] args) {
		
		child2.cs();
		child2 ob= new child2();
		ob.cn();
		
		
		child2.ps();
		ob.pn();
		
		//parent<=> child1
		// parent<=> child2
		
	}
	
	
	public static void cs()
	{
		System.out.println("child class static method");
	}
	
	
	public void cn()
	{
		System.out.println("child class non static method");
	}
}

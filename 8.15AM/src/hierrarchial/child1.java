package hierrarchial;

import inheritance.child;

public class child1 extends parent{

	public static void main(String[] args) {
		
		child1.cs();
		child1 ob= new child1();
		ob.cn();
		
		
		child1.ps();
		ob.pn();
		
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

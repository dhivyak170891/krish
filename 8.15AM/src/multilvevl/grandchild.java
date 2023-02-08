package multilvevl;

public class grandchild  extends child{

	public static void main(String[] args) {
		
		
		//parent<=> child <=> grandchild
		
		// grandhchild=own methd, child methds, parent methds
		
		grandchild.gs();
		grandchild g= new grandchild();
		g.gn();
		
		//after inheritance
		grandchild.cs();
		g.cn();
		
		grandchild.ps();
		g.pn();
		
	}
	
	

	public static void gs()
	{
		System.out.println("grandchild class static method");
	}
	
	
	public void gn()
	{
		System.out.println("grandchild class non static method");
	}
}

package abstraction;

public class child extends parent {
	
	public static void main(String[] args) {
		
		child c= new child();
		c.a();
		c.ab();
		
		//parent p= new parent();  we cannot create object for abstract class 
		
	}

	@Override
	public void ab() {
		System.out.println("abstract method");
		
	}

}

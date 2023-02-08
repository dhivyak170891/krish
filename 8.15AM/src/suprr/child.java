package suprr;

public class child extends parent{

	int age=30;
	public static void main(String[] args) {
		
		child c= new child();
		c.display();
		
	}
	
	public void display()
	{
		System.out.println(age);//locally defined age
		System.out.println(super.age);//parent's age value
		//super keyword points to parent reference 
	}
}

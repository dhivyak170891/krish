package inheritance;

public class child  extends parent{
public static void main(String[] args) {
	
	// calling its own method
	
	child c= new child();
	c.cn();
	child.cs();
	
	//after inheritance
	
	
	child.ps();//calling parent class static method using child name
	c.pn();//    calling parent class nonstatic method using child object 
	
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

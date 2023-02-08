package Interf;

public interface Intro {
	
	//interface: blue print of a class
	
	// doesnot contain main  method
	//doesnot contain static method
	//will have nonstatic method with default
	// will have abstract method
	   //  doesnot contain abstract keyword
	    // nonstatic 
	//     empty in its own place
	//     will be redefined in the class to which interface connects to
	
	//  class<=> class :    extends
	//  class<=> interface: implements
	//    class definition:  implements interfacename 
	
	//nonstatic 
	default public void ns()
	{
		System.out.println("nonstatic method");
	}
	
	//abstract method
	public void ab();

}

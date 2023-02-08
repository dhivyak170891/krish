package abstraction;

abstract public class parent {
	/*asbtraction: hiding implementation details
	 *  follows inheritance
	 * achieved through abstract class and abstract method
	 * class=> abstract class:  add abstract keyword before it
	 * abstract class:  nrml method and abstract method
	 abstract method
	            nonstatic
	 *           abstract keyword before it
	 *           will be empty in its own class
	 *           will be redefined in its derived class
	 *           
	 * we cannot create an object for abstract class 
	 ** 
	 * */
	
	public void a()
	{
		System.out.println("nrmlmethod");
	}
	
	abstract public void ab();
}

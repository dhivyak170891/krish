package inheritance;

public class parent {

	/*inheritance: process in which one class acquires properties of other class
	 * 
	 * parent/super/base :  class whose properties are inherited
	 * child/sub/derived:  class which uses properties of parent class
	 * 
	 *   child is using parent 
	 *   
	 *   to achieve: in child class defintiion=>   extends parentclassname
	 *   
	 *   after inheritance:
	 *   
	 *   child is having full control on the parent
	 *   can call parent methods with child object itself 
	 * 
	 * */
	
	public static void ps()
	{
		System.out.println("parent class static method");
	}
	
	
	public void pn()
	{
		System.out.println("parent class non static method");
	}
}


/*
 *single:  parent<=> child
 *multiple:  parent1, parent2<=> child   // java doesnot support 
 *hierrarchial: parent<=> child1,child2
 *multilevel: parent<=> child<=> grandchild 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

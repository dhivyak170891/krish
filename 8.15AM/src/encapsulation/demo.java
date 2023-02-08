package encapsulation;

public class demo {

	/*
	 * encapsulation:   data hiding
	 * 
	 *     declare the variable as private
	 *     must not assign value straightly to the variable
	 *     access the variable through setters and getter
	 *     
	 *     setter:  assign value to the variable
	 *     getter:  view the value stored in the variable
	 *     
	 *     setter, getter: public, nonstatic methods 
* 
	 * */
	
	private String password;
	
	
	//setter
	public void setp(String p)
	{
		password=p;
	}
	
	//getter
	public void getp()
	{
		System.out.println(password);
	}
	
}

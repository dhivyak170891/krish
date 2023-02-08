package loops;

public class nested {
public static void main(String[] args) {
	/*
	 * 
	 * if(condition1)
	 * {
	 * true
	 * }
	 * else if(con2)
	 * {
	 * con2 true
	 * }
	 * else
	 * {false
	 * }
	 */
	
	int age=18;
	
	if(age<18)
	{
		System.out.println("minor");
	}
	
	else if(age>18)
	{
		System.out.println("major");
	}
	
	else
	{
		System.out.println("age is 18");
	}
}
}

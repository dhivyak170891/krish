package loops;

public class f1 {
	
	public static void main(String[] args) {
		
		/*
		 * while/do while/for 
		 * 
		 * initialisation:   where to start 
		 * 
		 * condition checking:    where to stop
		 *  
		 *                      forward:  <=end value
		 *                      backward: >=end value
		 *                      
		 * inc/dec :           difference btween 2 consecutive numbers
		 * 
		 * 
		 * syntax:
		 * 
		 * for(initialisation; condition checking; inc/dec)
		 * {
		 * statement
		 * }
		 * 
		 * 13,11,9,7,5,3,1
		 * 
		 * 
		 * 1,3,5,7,9,11,13
		 */
		
		for(int i=13; i>=1;i=i-2)
		{
			System.out.println(i);
		}
	}

}

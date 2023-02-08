package loops;

public class dow {
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
	 * syntax:
	 * 
	 * initialisation
	 * do
	 * {
	 * statement
	 * inc/dec
	 * }
	 * while(condition);
	 * 
	 * 4th table   4,8,12,16......40
	 * 
	 * odd numbers from 1 to 11       1,3,5,7,9,11
	 */
	
	int i=4;
	do
	{
		System.out.println(i);
		i=i+4;
	}
	while(i<=40);
}
}

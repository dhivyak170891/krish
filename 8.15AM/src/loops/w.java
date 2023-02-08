package loops;

public class w {
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
	 *  initialisation
	 *  while(condition)
	 *  {
	 *  statement
	 *  inc/dec 
	 *  } 
	 *  
	 *  even numbers from 10 to 20      10,12,14,16,18,20
	 *  
	 *  1,2,3,...10
	 * * 
	 * */
	
	int i=10;
	while(i<=20)
	{
		System.out.println(i);
		i=i+2;
	}
	
	// 5th table:    50,45,40....5
	
	int a=50;
	while(a>=5)
	{
		System.out.println(a);
		a=a-5;
	}
}
}

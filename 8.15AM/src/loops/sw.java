package loops;

public class sw {

	public static void main(String[] args) {
		/*
		 * 
		 * switch(expression)
		 * {
		 * case:
		 *    statement
		 *    break;
		 *    
		 *  case:
		 *    statement
		 *    break;
		 *    
		 *  case:
		 *    statement
		 *    break;
		 *    
		 *    
		 *   default: 
		 *      statement
		 *      break;
		 *      * 
		 * 
		 * 
		 * */
		
		String fruits="grapes";
		
		switch(fruits)
		{
		
		case "apple":
			System.out.println("apple");
			break;
		case "orange":
			System.out.println("orange");
			break;
			
		case "pineapple":
			System.out.println("pineapple");
			break;
			
		case "kiwi":
			System.out.println("kiwi");
			break;
			
		 default:
			System.out.println("doesnot match");
			break;
			
		}
	}
}

package operators;

public class op1 {
	
	public static void main(String[] args) {
		
		/*
		 * arithmetic operators:   +,-,*,/
		 * comparison operators:   <,>,<=,>=,==,!=
		 * assignment operators:   +=,-=,*=,/=
		 * conditional operator:   condition ?  true : false 
		 * logical operators :     and, or, nt
		 * 
		 * 
		 * 
		 * 
		 * */
		
		int age=4;
		//                 cond  ?   true  :  false 
		System.out.println(age>18 ? "major": "minor");
		
		// add 10 to  age 
		//age+=10;
		
		//sub age by 2
		//age-=2;
		
		//mult age by 3
		//age*=3;
		
		// divide age by 4
		//age/=4;
		//System.out.println(age);
		
		/*
		 * an d  : &&
		 * 
		 * con1   con2   output
		 * 
		 * True   True    True
		 * True   False   false
		 * false  true    false
		 * false  false   false
		 * 
		 * 
		 * 
		 *  * or  :||
		 * 
		 * con1   con2   output
		 * 
		 * True   True    True
		 * True   False   True
		 * false  true    True
		 * false  false   false
		 * 
		 * 
		 * not  : !
		 * 
		 * true=> false
		 * false=> true
		 * 
		 * * 
		 * */
		
		int m=89;
		int n=90;
		
		System.out.println("And ");
		System.out.println(m==89 && n>20);
		System.out.println(m==89 && n==20);
		System.out.println(m==0 && n>20);
		System.out.println(m==0 && n==0);
		
		System.out.println("or ");
		System.out.println(m==89 || n>20);
		System.out.println(m==89 || n==20);
		System.out.println(m==0 || n>20);
		System.out.println(m==0 || n==0);
		
		System.out.println("Not");
		System.out.println(m==89);//true
		System.out.println(m!=89);//false
		
		
	}

}

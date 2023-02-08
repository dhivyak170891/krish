package basics;

public class m4 {
	public static void main(String[] args) {
		// other than void
		// add return statement at the end
		// call within sysout statement
		
		m4 ob= new m4();
		System.out.println(ob.div());
		System.out.println(ob.add());
		
		// public: return area of square
		// private: return average of two decimal values 
	}
	
	
	public int div()
	{
		int a=90;
		int b=3;
		int c=a/b;
		return c;
	}
	
	private float add()
	{
		float a=9.8f;
		float b=2.3f;
		return a+b;
	}

}

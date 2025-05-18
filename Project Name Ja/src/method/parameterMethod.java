package method;

public class parameterMethod {
	
	public static void Addition (int a, int b) {
		int c= a+b ;
		System.out.println("Addition="+c);
		
	}

    public static void Multiplication (int x, int y)	{
    	int z=x*y;
    	System.out.println("Multiplication="+z);
    }
    public static void main(String[] args) {
		Addition (70,80);
		Addition (50,40);
		
		
		parameterMethod w = new parameterMethod ();
		w.Addition (60,20);
		w.Addition(30,10);
		w.Multiplication(50,5);
		Multiplication(20,30);
	}
}

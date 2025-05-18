package method;

public class parameterMethod1 {
	
	public static void Addition(int a, int b) {
		int c=a+b;
		System.out.println("Addtion="+c);
		
	}
		public void Multiplication(int x, int y) {
			int z=x+y;
			System.out.println("Multiplication="+z);
		
		
	}
		public static void main(String[] args) {
			Addition (50,50);
			
			parameterMethod1 s =new parameterMethod1();
			s.Multiplication (50,10);
			s.Multiplication(60,80);
			
		}

}
